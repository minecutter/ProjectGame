package com.main.Maps;

import com.main.Combat;
import com.main.DiedExeption;
import com.main.Entitys.Enemies;
import com.main.Entitys.Player;
import com.main.Inventory;
import com.main.Item;

import java.util.Random;

public class EnemyRoom extends Room {

    private Item itemDrop;
    private boolean item = false;
    private Enemies enemy;

    Combat combat = new Combat();

    public EnemyRoom(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall, String name, Enemies enemies){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;

       enemy = enemies;
    }
    public EnemyRoom(Wall posXWall, Wall negXWall, Wall posYWall, Wall negYWall, String name, Enemies enemies, Item dropItem){
        walls[Direction.POSX.ordinal()] = posXWall;
        walls[Direction.NEGX.ordinal()] = negXWall;
        walls[Direction.POSY.ordinal()] = posYWall;
        walls[Direction.NEGY.ordinal()] = negYWall;

        itemDrop = dropItem;
        enemy = enemies;
        item = true;
    }

    public void startRoom(Player player)throws DiedExeption {
        print("When you enter the room you are confronted by a " + enemy.name);

        combat.start(enemy, player);

    }

    public void endRoom(Inventory inventory){
        if(item == true) {
            inventory.add(itemDrop);
        }
    }
}
