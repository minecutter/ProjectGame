package com.main.Entitys;

import com.main.Entity;
import com.main.Helpers;

public class Ara extends Entity {

    public Ara(String name) {
        super(name);
        armor = 1;
        hp = 2;
        xp = 1000000000;
        gold = 0;
        fightStartText = "All right lets start your test.";
        infoText = "You don't need to know anything about me.";
        damageRangMin = 5;
        damageRangMax = 10;
        hitChance = 100;
    }
}
