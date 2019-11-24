package com.main.Maps;

import java.awt.*;

public class Level3 extends Level {
    public Level3() {
        Wall wall = new Wall();
        Door door = new Door();

        rooms = new Room[][]{
                {new Room(wall, wall, door, wall, "(0,0)"), new Room(wall, wall, door, door, "(0,1)"), new Room(wall, wall, door, door, "(0,2)"), new Room(wall, wall, wall, door, "(0,3)")}
        };

        startPoint = new Point(0,0);
        endPoint = new Point(0,3);
        currentDirection = Direction.POSY;

        //POSX, NEGX, POSY, NEGY

    }
}
