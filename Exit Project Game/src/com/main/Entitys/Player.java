package com.main.Entitys;

import com.main.Entity;
import com.main.Inventory;


public class Player extends Entity {

    public Inventory inventory = new Inventory();

    public String items;
    public int mp;

    public void level1Stats(){
        hp = 100;
        mp = 100;
        gold = 10;
        xp = 0;

    }
    public void level2Stats(){
        hp = 150;
        mp = 150;

    }
    public void level3Stats(){
        hp = 200;
        mp = 200;

    }


}
