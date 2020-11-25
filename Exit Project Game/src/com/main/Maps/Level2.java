package com.main.Maps;

import com.main.DiedExeption;
import com.main.Entitys.HumanSpearMan;
import com.main.Entitys.HumanSwordMan;
import com.main.Entitys.PC;

import java.awt.*;

public class Level2 extends Level {
    public void level2() {
        rooms = new Room[][]{
                {new Room(/* Empty                           */), new Room(door, wall, door, wall, "(0,1)"), new EnemyRoom(wall, wall, door, door,"(0,2)", new HumanSwordMan()), new Room(door, wall, door, wall, "(0,3)")},
                {new Room(wall, wall, door, wall, "(1,0)"), new EnemyRoom(door, door, door, door,"(1,1)", new HumanSpearMan()), new Room(wall, wall, wall, door, "(1,2)"), new Room(door, door, wall, wall, "(1,3)")},
                {new Room(/* Empty                           */), new Room(door, door, door, wall, "(2,1)"), new Room(door, wall, wall, door, "(2,2)"), new Room(door, door, wall, wall, "(2,3)")},
                {new Room(/* Empty                           */), new Room(door, door, wall, wall, "(3,1)"), new Room(wall, door, wall, wall, "(3,2)"), new EnemyRoom(door, door, wall, wall,"(3,3)", new HumanSwordMan())},
                {new Room(/* Empty                           */), new Room(wall, door, wall, door, "(4,1)"), new Room(wall, door, wall, wall, "(4,2)"), new Room(wall, door, wall, wall, "(4,3)")}
        };
        startPoint = new Point(1,0);
        endPoint = new Point(4,3);
        currentDirection = Direction.POSY;
        //                                                                                                                                      POSX, NEGX, POSY, NEGY
    }

    public void startLevel(PC PC){
        print("You go up the ladder and into the next room.");
    }

    public void endLevel(PC PC) throws DiedExeption {
        print("You slowly walk up a flight of stairs to the final floor.");

        PC.nameCheck();
        new Level3().playLevel(PC);

    }
}
