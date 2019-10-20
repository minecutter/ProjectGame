package com.main.Maps;

import com.main.Helpers;

import javax.naming.directory.SearchControls;

public class Room {
    Helpers h = new Helpers();
    Level level = new Level();

    private WallType posXWall;
    private WallType negXWall;
    private WallType posYWall;
    private WallType negYWall;

    private boolean entersRoomFromPosX = false;
    private boolean entersRoomFromNegX = false;
    private boolean entersRoomFromPosY = false;
    private boolean entersRoomFromNegY = false;

    public Room(WallType posXWall, WallType negXWall, WallType posYWall, WallType negYWall){
        this.posXWall = posXWall;
        this.negXWall = negXWall;
        this.posYWall = posYWall;
        this.negYWall = negYWall;
    }

    public Room(){
        posXWall = WallType.WALL;
        negXWall = WallType.WALL;
        posYWall = WallType.WALL;
        negYWall = WallType.WALL;
    }


    public void startRoom(Room startRoom){

    }

    public void endRoom(){

    }

    public void nextRoom(){


    }

    public void menu(Room currentRoom, String posXWall, String negXWall, String posYWall, String negYWall){

        if(entersRoomFromPosX == true){
            entersRoomFromPosX = false;
            menuEntersRoomFromPosX(currentRoom);

        }
        else if(entersRoomFromNegX == true){
            entersRoomFromNegX = false;
            menuEntersRoomFromNegX(currentRoom);

        }
        else if(entersRoomFromPosY == true){
            entersRoomFromPosY = false;
            menuEntersRoomFromPosY(currentRoom);

        }
        else if(entersRoomFromNegY == true){
            entersRoomFromNegY = false;
            menuEntersRoomFromNegY(currentRoom);

        }
    }

    private void menuEntersRoomFromPosX(Room currentRoom){
        switch (h.menu("Foreword", "Right", "Left", "Back", "Search")){
            case "Foreword":
                if (canMove(Direction.NEGX, currentRoom) == true){
                    entersRoomFromPosX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Right":
                if (canMove(Direction.NEGY, currentRoom) == true){
                    entersRoomFromPosY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Left":
                if (canMove(Direction.POSY, currentRoom) == true){
                    entersRoomFromNegY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Back":
                if (canMove(Direction.POSX, currentRoom) == true){
                    entersRoomFromNegX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Search":
                searchRoom(currentRoom);

                break;
        }

    }

    private void menuEntersRoomFromNegX(Room currentRoom){
        switch (h.menu("Foreword", "Right", "Left", "Back", "Search")){
            case "Foreword":
                if (canMove(Direction.POSX, currentRoom) == true){
                    entersRoomFromNegX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Right":
                if (canMove(Direction.POSY, currentRoom) == true){
                    entersRoomFromNegY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Left":
                if (canMove(Direction.NEGY, currentRoom) == true){
                    entersRoomFromPosY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Back":
                if (canMove(Direction.NEGX, currentRoom) == true){
                    entersRoomFromPosX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Search":
                searchRoom(currentRoom);

                break;
        }

    }

    private void menuEntersRoomFromPosY(Room currentRoom){
        switch (h.menu("Foreword", "Right", "Left", "Back", "Search")){
            case "Foreword":
                if (canMove(Direction.NEGY, currentRoom) == true){
                    entersRoomFromPosY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Right":
                if (canMove(Direction.NEGX, currentRoom) == true){
                    entersRoomFromPosX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Left":
                if (canMove(Direction.POSX, currentRoom) == true){
                    entersRoomFromNegX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Back":
                if (canMove(Direction.POSY, currentRoom) == true){
                    entersRoomFromNegY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Search":
                searchRoom(currentRoom);

                break;
        }

    }

    private void menuEntersRoomFromNegY(Room currentRoom){
        switch (h.menu("Foreword", "Right", "Left", "Back", "Search")){
            case "Foreword":
                if (canMove(Direction.POSY, currentRoom) == true){
                    entersRoomFromNegY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Right":
                if (canMove(Direction.POSX, currentRoom) == true){
                    entersRoomFromNegX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Left":
                if (canMove(Direction.NEGX, currentRoom) == true){
                    entersRoomFromPosX = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Back":
                if (canMove(Direction.NEGY, currentRoom) == true){
                    entersRoomFromPosY = true;
                    nextRoom();

                }
                else {


                }

                break;
            case "Search":
                searchRoom(currentRoom);

                break;
        }

    }

    private void searchRoom(Room currentRoom){


    }

    public boolean canMove(Direction direction, Room currentRoom){


        return false;
    }
}
