package com.main.Maps;

import com.main.Entitys.HumanSpearMan;
import com.main.Helpers;

import java.awt.*;

public class Level1 extends Level {



    public Level1(){
        Wall wall = new Wall();
        Door door = new Door();
        LockedDoor lDoor = new LockedDoor();

        rooms = new Room[][]{
            {new Room(/* Empty                           */), new Room(door, wall, door, wall, "(0,1)"), new Room(door, wall, door, door, "(0,2)"), new EnemyRoom(door, wall, door, wall, new HumanSpearMan())},
            {new Room(wall, wall, door, wall, "(1,0)"), new Room(door, door, door, wall, "(1,1)"), new Room(door, door, door, door, "(1,2)"), new Room(door, door, wall, door, "(1,3)")},
            {new Room(/* Empty                           */), new Room(lDoor, door,door, wall, "(2,1)"), new Room(wall, door, door, door, "(2,2)"), new Room(wall, door, wall, door, "(2,2)")},
            {new Room(/* Empty                           */), new Room(wall, door, wall, wall, "(3,1)"), new Room(/* Empty                           */), new Room(/* Empty                           */)}
        };
//        rooms = new Room[][]{
//                {new Room(new Door(), new Wall(), new Door(), new Wall(), "top left"), new Room(new Wall(), new Door(), new Door(), new Wall(), "top right") },
//                {new Room(new Door(), new Wall(), new Wall(), new Door(), "bottom left"), new Room(new Wall(), new Door(), new Wall(), new Door(),"bottom right")}
//        };
        // can chang the new Room to like new TPRoom
        // put possible direction in rooms
        // top left (0,0) top right is (0,3)

        startPoint = new Point(1,0);
        endPoint = new Point(3,1);
        currentDirection = Direction.POSY;

        //POSX, NEGX, POSY, NEGY


    }

    public void startLevel(){
        print("startLevel");



    }
    public void endLevel(){
        print("end level");

    }
}
