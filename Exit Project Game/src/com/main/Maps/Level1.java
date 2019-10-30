package com.main.Maps;

public class Level1 extends Level {
    public Level1(){


        rooms = new Room[][]{
            {new Room(/* Empty */), new Room(), new Room(), new Room()},
            {new Room(new Wall(), new Wall(), new Door(), new Wall()), new Room(), new Room(), new Room()},
            {new Room(/* Empty */), new Room(), new Room(), new Room()},
            {new Room(/* Empty */), new Room(), new Room(/* Empty */), new Room(/* Empty */)}
        };
        // can chang the new Room to like new TPRoom
        // put possible direction in rooms
        // top left (0,0) top right is (0,3)

        startRoom = rooms[1][0];
        endRoom = rooms[3][1];
        currentDirection = Direction.POSY;
        /*POSX = east, NEGX = west, POSY = north, NEGY = south*/


    }


}
