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

//    private Wall posXWall;
//    private Wall negXWall;
//    private Wall posYWall;
//    private Wall negYWall;

    private static final int wallCount = Direction.values().length;

    private Wall[] walls = new Wall[wallCount];

    private String posXWallText;
    private String negXWallText;
    private String posYWallText;
    private String negYWallText;
    private String otherRoomText;

    private boolean entersRoomFromPosX = false;
    private boolean entersRoomFromNegX = false;
    private boolean entersRoomFromPosY = false;
    private boolean entersRoomFromNegY = false;

//    public Room(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall,String posXWallText, String negXWallText, String posYWallText, String negYWallText, String otherRoomText){
//        this.posXWall = posXWall;
//        this.negXWall = negXWall;
//        this.posYWall = posYWall;
//        this.negYWall = negYWall;
//        this.posXWallText = posXWallText;
//        this.negXWallText = negXWallText;
//        this.posYWallText = posYWallText;
//        this.negYWallText = negYWallText;
//        this.otherRoomText = otherRoomText;
//
//    }

    public Room(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;

    }

    public Room(){
//        posXWall = Wall.WALL;
//        negXWall = Wall.WALL;
//        posYWall = Wall.WALL;
//        negYWall = Wall.WALL;
    }

    public void playRoom(Direction direction){
        startRoom();
        menu(direction);
        endRoom();
    }

    public void startRoom(){

    }


    public void endRoom(){


    }

    public void nextRoom(){


    }

    public Direction menu(Direction direction) {
        print("In front of you is " + walls[direction.ordinal()].toString());
        print("To the right there is " + walls[(direction.ordinal() + 1) % wallCount].toString());
        print("To the left there is " + walls[(direction.ordinal() - 1) % wallCount].toString());

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
    private void searchRoom () {


    }
}
