package com.main.Entitys;

import com.main.Entity;
import com.main.Inventory;


public class PC extends Entity {

    public Inventory inventory = new Inventory();

    public String items;
    public int mp;
    private int levelStats = 2;
    public boolean tutorialLevel = true;

    public void nameCheck(){
        if(name.toLowerCase().equals("Sans")) {}
        else if(name.toLowerCase().equals("Not very helpful")){}
        else {
           if(levelStats == 2) {
               level2Stats();
               levelStats++;
           }
           else if(levelStats == 3){
               level3Stats();
           }

        }
    }


    public PC(){
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
    public void loganStats(){
        hp = 1000;
        mp = 1000;

    }
    public void sansStats(){
        hp = 1;
        mp = 1000000000;
    }
}
