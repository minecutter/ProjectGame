package com.main;

import com.main.Entitys.Enemies;
import com.main.Entitys.Player;
import com.main.Items.Magic.Magic;
import com.main.Items.Magic.MagicEffect;
import com.main.Items.Swords.Swords;

public class Combat {

    private boolean tutorialLevel = true;

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}
    protected Helpers h = new Helpers();
    protected StartGame startGame = new StartGame();
    protected Player player = new Player();

    public void start(Enemies enemy){

        if(tutorialLevel == true){
            araPrint("Thea's are the basic steps of combat for idiots that have never plaid games before.");
            araPrint("If you have plaid games before good for you, but I don't care so your getting my long bit of dialog anyway.");
            araPrint("The first command for when you are in combat is ATTACK.");

            Helpers.myWait(200);

            araPrint("What are you expecting a deeper explanation you will literally just attack the target with your sword.");
            araPrint("The second command for when you are in combat is MAGIC.");
            araPrint("When you use this command you will aces your magic list and have to pick the magic you want to use.");
            araPrint("");

        }

        while (enemy.hp > 0 && player.hp > 0) {
            print(player.name + ": HP= " + player.hp + " MP= " + player.mp);
                switch (h.menu("attack", "magic", "info")) {
                    case "info":
                        info(enemy);

                        continue;

                    case "attack":
                        attack(enemy);

                        break;

                    case "magic":
                        magic(enemy);

                        break;
                }

            enemyAttack(enemy);
            endFight(enemy);

            if(tutorialLevel == true){
                tutorialLevel = false;
                break;
            }
        }


    }

    private void attack(Enemies enemy){
        Swords s = player.inventory.menu(Swords.class);

        float damage = s.damage * enemy.armor;

        enemy.hp = enemy.hp - damage;

        print("You attack your enemy dealing " + (int)damage + " damage.");

        hpIndicator(enemy);
    }

    private void magic(Enemies enemy){
        Magic m = player.inventory.menu(Magic.class);

        if (m.effect == MagicEffect.ENEMY){
            enemy.hp = enemy.hp - m.damage;

            print("You use " + m.name + " it does " + m.damage + " magic damage.");

            hpIndicator(enemy);
        }
        else if(m.effect == MagicEffect.SELF){
            player.hp = player.hp + m.damage;
        }

    }

    private void info(Enemies enemy){
        araPrint(enemy.infoText);

    }

    private void hpIndicator(Enemies enemy){
        if (enemy.hp > 80) {
            print(enemy.name + " looks like they barely hurt at all.");

        }
        else if (enemy.hp <= 80 && enemy.hp > 40){
            print(enemy.name + " looks like they are starting to be hurt.");

        }
        else if (enemy.hp <= 40 && enemy.hp > 10){
            print(enemy.name + " looks like they are hurt really badly.");

        }
        else if (enemy.hp <= 10 && enemy.hp > 0){
            print(enemy.name + " looks like they are about to die.");

        }
    }

    private void enemyAttack(Enemies enemy){
        print(enemy.name + " goes in for an attack.");

        if(h.randomNumber(0, 100) <= enemy.hitChance){
            float damage = h.randomNumber(enemy.damageRangMin, enemy.damageRangMax);

            player.hp = player.hp - damage;

            print(enemy.name + " hits dealing " + damage + " damage.");

        }
        else {
            print(enemy.name + " missed their attack.");

        }

    }

    private void endFight(Entity enemy){
        if(player.hp <= 0){
            araPrint("You are really pitiful you know.");

            print("You here Ara say right before you die.");

            h.myWait(300);

            startGame.startGame(false);
        }
        else if(enemy.hp <= 0){
            print(enemy.name + " falls down and slowly starts dieing");
            print("You take you sword and finish him of");

        }

    }
}
