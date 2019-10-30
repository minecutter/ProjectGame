package com.main.Maps;

public class Level {

    protected Room[][] rooms;
    protected Room currentRoom;
    protected Room previousRoom;
    protected Room startRoom;
    protected Room endRoom;
    protected Direction currentDirection;


    public void startLevel(){
        // TODO start level
        currentRoom = startRoom;
        currentRoom.playRoom(currentDirection);
    }

//    public void startRoom(){
//        // TODO the first
//        currentRoom.menu(currentDirection);
//    }

    public void nextRoom(Room room){
        // TODO the room you move into
        previousRoom = currentRoom;
        currentRoom = room;


    }

}
