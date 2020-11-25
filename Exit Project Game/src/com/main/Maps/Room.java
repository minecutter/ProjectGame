package com.main.Maps;

import com.main.DiedExeption;
import com.main.Entitys.PC;
import com.main.Helpers;
import com.main.Inventory;
import com.main.Items.Keys.Key;

public class Room {
    Helpers h = new Helpers();
    Level level = new Level();

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}

    public String Name = "";
    public Key key = new Key();

    protected static final int wallCount = Direction.values().length;

    protected Wall[] walls = new Wall[wallCount];

    public Room(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall, String name){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;
        Name = name;

    }
    public Room(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall, String name, Key Key){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;
        Name = name;
        key = Key;
    }

    public Room(){
        walls[Direction.POSX.ordinal()] = new Wall();
        walls[Direction.NEGX.ordinal()] = new Wall();
        walls[Direction.POSY.ordinal()] = new Wall();
        walls[Direction.NEGY.ordinal()] = new Wall();

    }

    public Direction playRoom(Direction direction, PC PC) throws DiedExeption {
        startRoom(PC);
        Direction travelDirection = menu(direction, PC);
        endRoom(PC.inventory);

        return travelDirection;
    }

    public void startRoom(PC PC) throws DiedExeption {


    }

    public void endRoom(Inventory inventory){


    }

    public Direction menu(Direction direction, PC PC) {
//        print(Name); //For testing purposes
        print("In front of you is " + walls[direction.ordinal()].toString());
        print("To the right there is " + walls[(direction.ordinal() + 3) % wallCount].toString());
        print("To the left there is " + walls[(direction.ordinal() + 1) % wallCount].toString());

        while (true) {
            Direction d;

            switch (h.menu("Forward", "Right", "Left", "Back")) {
                case "Forward":
                    if (!walls[direction.ordinal()].canEnter(PC, key)){
                        araPrint("a");
                        continue;
                    }

                    return direction;
                case "Right":
                    d = Direction.values()[(direction.ordinal() + 3) % wallCount];
                    if (!walls[d.ordinal()].canEnter(PC, key)){
                        print("you walk tords the ");
                        araPrint("s");
                        continue;
                    }

                    return d;
                case "Left":
                    d = Direction.values()[(direction.ordinal() + 1) % wallCount];
                    if (!walls[d.ordinal()].canEnter(PC, key)){
                        araPrint("a");
                        continue;
                    }

                    return d;
                case "Back":
                    d = Direction.values()[(direction.ordinal() + 2) % wallCount];
                    if (!walls[d.ordinal()].canEnter(PC, key)){
                        araPrint("a");
                        continue;
                    }

                    return d;
//                case "Search":
//                    searchRoom();
//
//                    continue;
            }
        }
    }
    protected void searchRoom () {
        print("There is nothing in this room that can help you.");

    }
}
