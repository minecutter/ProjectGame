package com.main.Maps;

import com.main.Entitys.HumanSpearMan;
import com.main.Helpers;

import java.awt.*;

public class Level1 extends Level {



    public Level1(){

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
        print("As you step though the portal and a very bright light and a loud rigging in you ears.");
        print("You instinctively cover you eyes as the light and ringing get louder.");
        print("Then suddenly it all stops.");
        print("You open your eyes and you are in a room with what appears to be a large magic circle on the ground beneath your feat.");



    }
    public void endLevel(){
        print("end level");

    }
}
