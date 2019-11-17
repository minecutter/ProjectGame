package com.main.Maps;

import com.main.Helpers;

import javax.naming.directory.SearchControls;
import java.lang.reflect.Array;

public class Room {
    Helpers h = new Helpers();
    Level level = new Level();

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}


    protected static final int wallCount = Direction.values().length;

    protected Wall[] walls = new Wall[wallCount];

    public Room(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;

    }

    public Room(){
        walls[Direction.POSX.ordinal()] = new Wall();
        walls[Direction.NEGX.ordinal()] = new Wall();
        walls[Direction.POSY.ordinal()] = new Wall();
        walls[Direction.NEGY.ordinal()] = new Wall();

    }

    public Direction playRoom(Direction direction){
        startRoom();
        Direction travelDirection = menu(direction);
        endRoom();
        return travelDirection;
    }

    public void startRoom(){

    }


    public void endRoom(){


    }

    public Direction menu(Direction direction) {
        print("In front of you is " + walls[direction.ordinal()].toString());
        print("To the right there is " + walls[(direction.ordinal() - 1) % wallCount].toString());
        print("To the left there is " + walls[(direction.ordinal() + 1) % wallCount].toString());

        while (true) {
            switch (h.menu("Forward", "Right", "Left", "Back", "Search")) {
                case "Forward":
                    return direction;

                case "Right":
                    return Direction.values()[(direction.ordinal() + 1) % wallCount];

                case "Left":

                    return Direction.values()[(direction.ordinal() - 1) % wallCount];
                case "Back":


                    return Direction.values()[(direction.ordinal() + 2) % wallCount];
                case "Search":
                    searchRoom();

                    continue;
            }
        }
    }
    protected void searchRoom () {
        print("There is nothing in this room that can help you.");

    }
}
