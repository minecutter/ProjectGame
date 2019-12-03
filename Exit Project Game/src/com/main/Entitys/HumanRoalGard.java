package com.main.Entitys;

public class HumanRoalGard extends Enemies {
    public HumanRoalGard() {
        name = "Warstone's Royal Gard";
        armor = 2/10;
        hp = 100;
        xp = 20;
        gold = 5;
        fightStartText = "Protect the king.";
        infoText = "This is the strongest unit in the army.";
        damageRangMin = 20;
        damageRangMax = 40;
        hitChance = 85;
    }
}
