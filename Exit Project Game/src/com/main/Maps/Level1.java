package com.main.Maps;

import com.main.Entitys.HumanSwordsman;

public class Level1 extends Level {
    public Level1(){


        rooms = new Room[][]{
            {new Room(/* Empty */), new Room(new Door(), new Wall(), new Door(), new Wall()), new Room(new Door(), new Wall(), new Door(), new Door()), new EnemyRoom(new Door(), new Wall(), new Wall(), new Door(), new HumanSwordsman())},
            {new Room(new Wall(), new Wall(), new Door(), new Wall()), new Room(new Door(), new Door(), new Door(), new Wall()), new Room(new Door(), new Door(), new Door(), new Door()), new Room(new Door(), new Door(), new Wall(), new Door())},
            {new Room(/* Empty */), new Room(new LockedDoor(), new Door(), new Door(), new Wall()), new Room(new Wall(), new Door(), new Door(), new Door()), new Room(new Wall(), new Door(), new Wall(), new Door())},
            {new Room(/* Empty */), new Room(new Wall(), new Door(), new Wall(), new Wall()), new Room(/* Empty */), new Room(/* Empty */)}
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
