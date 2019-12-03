package com.main.Maps;

import com.main.Combat;
import com.main.DiedExeption;
import com.main.Entitys.Enemies;

import java.util.Random;

public class EnemyRoom extends Room {

    private Enemies enemy;

    Combat combat = new Combat();

    public EnemyRoom(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall, Enemies enemies){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;

       enemy = enemies;
    }

    public void startRoom()throws DiedExeption {
        print("When you enter the room you are confronted by a " + enemy.name);

        combat.start(enemy);

    }

    public void endRoom(){


    }
}
