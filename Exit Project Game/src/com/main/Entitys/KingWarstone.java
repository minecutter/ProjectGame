package com.main.Entitys;

public class KingWarstone extends Enemies {
    public KingWarstone() {
        name = "Human Sword Man";
        armor = 2 / 10;
        hp = 100;
        xp = 20;
        gold = 5;
        fightStartText = "Die you filthy Demon.";
        infoText = "This enemy is much stronger than the spear man though still not very strong.";
        damageRangMin = 10;
        damageRangMax = 30;
        hitChance = 65;
    }
}
