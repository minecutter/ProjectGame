package com.main.Maps;

public class Level {

    protected Room[][] rooms;
    protected Room currentRoom;
    protected Room previousRoom;
    protected Room startRoom;
    protected Room endRoom;

    Room room = new Room();
    public void startLevel(){
        // TODO start level
        currentRoom = startRoom;
    }

    public void startRoom(){
        // TODO the first
    }

    public void nextRoom(Room room){
        // TODO the room you move into
        previousRoom = currentRoom;
        currentRoom = room;
        room.menu(currentRoom,"","","","");

    }

}
