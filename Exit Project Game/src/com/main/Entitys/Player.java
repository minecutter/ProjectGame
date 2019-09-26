package com.main.Entitys;

import com.main.Entity;
import com.main.Inventory;


public class Player extends Entity {

    public Inventory inventory = new Inventory();

    public String items;
    public int Mp = 100;

    public Player(String name) {
        super(name);
    }


}
