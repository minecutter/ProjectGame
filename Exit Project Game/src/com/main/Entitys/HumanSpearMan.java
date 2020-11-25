package com.main.Entitys;

public class HumanSpearMan extends NPC {
    public HumanSpearMan() {
        name = "Human Spear Man";
        armor = 0;
        hp = 100;
        xp = 20;
        gold = 5;
        fightStartText = "Die you filthy Demon.";
        infoText = "This is the weakest and most basic human there is if you die here then you just suck at games.";
        damageRangMin = 5;
        damageRangMax = 20;
        hitChance = 50;
    }
}
