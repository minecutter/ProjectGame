package com.main.Entitys;

public class KingWarstone extends Enemies {
    public KingWarstone() {
        name = "King Warstone";
        armor = 4 / 10;
        hp = 100;
        xp = 20;
        gold = 5;
        fightStartText = "Are you read to die Demon.";
        infoText = "This is the king of the humans and the most powerful fighter in there kingdom.";
        damageRangMin = 20;
        damageRangMax = 40;
        hitChance = 85;
    }
}
