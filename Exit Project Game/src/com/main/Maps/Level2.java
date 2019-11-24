package com.main.Maps;

import java.awt.*;

public class Level2 extends Level {
    public void level2() {
        rooms = new Room[][]{
                {new Room(/* Empty                           */), new Room(door, wall, door, wall, "(0,1)"), new Room(wall, wall, door, door, "(0,2)"), new Room(door, wall, door, wall, "(0,3)")},
                {new Room(wall, wall, door, wall, "(1,0)"), new Room(door, door, door, door, "(1,1)"), new Room(wall, wall, wall, door, "(1,2)"), new Room(door, door, wall, wall, "(1,3)")},
                {new Room(/* Empty                           */), new Room(door, door, door, wall, "(2,1)"), new Room(door, wall, wall, door, "(2,2)"), new Room(door, door, wall, wall, "(2,2)")},
                {new Room(/* Empty                           */), new Room(door, door, wall, wall, "(3,1)"), new Room(wall, door, wall, wall, "(3,2)"), new Room(door, door, wall, wall, "(3,3)")},
                {new Room(/* Empty                           */), new Room(wall, door, wall, door, "(4,1)"), new Room(wall, door, wall, wall, "(4,2)"), new Room(wall, door, wall, wall, "(4,3)")}
        };
        startPoint = new Point(1,0);
        endPoint = new Point(4,3);
        currentDirection = Direction.POSY;
        //                                                                                                                                      POSX, NEGX, POSY, NEGY
    }
    }
