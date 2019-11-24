package com.main.Maps;

import com.main.Entitys.HumanRoalGard;
import com.main.Entitys.KingWarstone;

import java.awt.*;

public class Level3 extends Level {
    public Level3() {


        rooms = new Room[][]{
                {new EnemyRoom(wall, wall, door, wall, new HumanRoalGard()), new EnemyRoom(wall, wall, door, door, new HumanRoalGard()), new EnemyRoom(wall, wall, door, door, new HumanRoalGard()), new EnemyRoom(wall, wall, wall, door, new KingWarstone())}
        };

        startPoint = new Point(0,0);
        endPoint = new Point(0,3);
        currentDirection = Direction.POSY;

        //POSX, NEGX, POSY, NEGY

    }
}
