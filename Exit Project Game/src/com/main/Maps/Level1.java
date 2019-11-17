package com.main.Maps;

import com.main.Entitys.HumanSpearMan;
import com.main.Helpers;

import java.awt.*;

public class Level1 extends Level {



    public Level1(){



//        rooms = new Room[][]{
//            {new Room(/* Empty */), new Room(new Door(), new Wall(), new Door(), new Wall()), new Room(new Door(), new Wall(), new Door(), new Door()), new EnemyRoom(new Door(), new Wall(), new Wall(), new Door(), new HumanSpearMan())},
//            {new Room(new Wall(), new Wall(), new Door(), new Wall()), new Room(new Door(), new Door(), new Door(), new Wall()), new Room(new Door(), new Door(), new Door(), new Door()), new Room(new Door(), new Door(), new Wall(), new Door())},
//            {new Room(/* Empty */), new Room(new LockedDoor(), new Door(), new Door(), new Wall()), new Room(new Wall(), new Door(), new Door(), new Door()), new Room(new Wall(), new Door(), new Wall(), new Door())},
//            {new Room(/* Empty */), new Room(new Wall(), new Door(), new Wall(), new Wall()), new Room(/* Empty */), new Room(/* Empty */)}
//        };
        rooms = new Room[][]{
                {new Room(new Door(), new Wall(), new Door(), new Wall()), new Room(new Door(), new Wall(), new Wall(), new Door())},
                {new Room(new Wall(), new Door(), new Door(), new Wall()), new Room(new Wall(), new Door(), new Wall(), new Door())}
        };
        // can chang the new Room to like new TPRoom
        // put possible direction in rooms
        // top left (0,0) top right is (0,3)

        startPoint = new Point(1,0);
        endPoint = new Point(3,1);
        currentDirection = Direction.POSY;

        /*POSX = east, NEGX = west, POSY = north, NEGY = south*/


    }

    public void startLevel(){
        print("startLevel");

    }
    public void endLevel(){
        print("end level");
        
    }
}
