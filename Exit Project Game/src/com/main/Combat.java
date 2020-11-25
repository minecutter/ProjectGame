package com.main;

import com.main.Entitys.Enemies;
import com.main.Entitys.PC;
import com.main.Items.Magic.Magic;
import com.main.Items.Magic.MagicEffect;
import com.main.Items.Swords.Swords;

public class Combat {

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}
    protected Helpers h = new Helpers();

    public void start(Enemies enemy, PC PC) throws DiedExeption {

        boolean turn = true;

        if(PC.tutorialLevel == true){
            araPrint("Thea's are the basic steps of combat for idiots that have never plaid games before.");
            araPrint("If you have played games before good for you, but I don't care so your getting my long bit of dialog anyway.");
            araPrint("The first command for when you are in combat is ATTACK.");

            Helpers.myWait(2000);

            araPrint("What are you expecting a deeper explanation you will literally just attack the target with your sword.");
            araPrint("The second command for when you are in combat is MAGIC.");
            araPrint("When you use this command you will aces your magic list and have to pick the magic you want to use.");
            araPrint("");

        }

        while (enemy.hp > 0 && PC.hp > 0) {
            while (turn == true) {
                print(PC.name + ": HP= " + PC.hp + " MP= " + PC.mp);
                switch (h.menu("attack", "magic", "info")) {
                    case "info":
                        info(enemy);

                        break;

                    case "attack":
                        attack(enemy, PC);

                        turn = false;
                        break;

                    case "magic":
                        magic(enemy, PC);

                        turn = false;
                        break;
                }
            }
            turn = true;
            enemyAttack(enemy, PC);
            if(endFight(enemy, PC) == false){
                break;
            }

            if(PC.tutorialLevel == true){
                PC.tutorialLevel = false;
                break;
            }
        }


    }

    private void attack(Enemies enemy, PC PC){
        Swords s = PC.inventory.menu(Swords.class);

        float damage = s.damage * (1f - enemy.armor);

        enemy.hp = enemy.hp - damage;

        print("You attack your enemy dealing " + (int)damage + " damage.");

        hpIndicator(enemy);
    }

    private void magic(Enemies enemy, PC PC){
        Magic m = PC.inventory.menu(Magic.class);
        while (true) {
            if (m.effect == MagicEffect.ENEMY) {

                PC.mp = PC.mp - m.mpCost;
                if (PC.mp <= 0) {
                    PC.mp = 0;
                }
                else {
                    enemy.hp = enemy.hp - m.damage;
                    print("You use " + m.name + " it does " + m.damage + " magic damage.");
                }
                hpIndicator(enemy);
            } else if (m.effect == MagicEffect.SELF) {
                PC.hp = PC.hp + m.damage;
            }
        }
    }

    private void info(Enemies enemy){
        araPrint(enemy.infoText);

    }

    private void hpIndicator(Enemies enemy) {

        if (enemy.name.equals("Ara")) {
            if (enemy.hp > 0) {
                print("Ara doesn't look hurt at all.");
            } else if (enemy.hp <= 0) {
                print("You killed Ara.");
                print("Your vision blurs and you loss consciousness.");
            }
        } else if (enemy.hp > 80) {
            print(enemy.name + " looks like they barely hurt at all.");

        } else if (enemy.hp <= 80 && enemy.hp > 40) {
            print(enemy.name + " looks like they are starting to be hurt.");

        } else if (enemy.hp <= 40 && enemy.hp > 10) {
            print(enemy.name + " looks like they are hurt really badly.");

        } else if (enemy.hp <= 10 && enemy.hp > 0) {
            print(enemy.name + " looks like they are about to die.");

        }

    }

    private void enemyAttack(Enemies enemy, PC PC){
        print(enemy.name + " goes in for an attack.");

        if(h.randomNumber(0, 100) <= enemy.hitChance){
            float damage = h.randomNumber(enemy.damageRangMin, enemy.damageRangMax);

            PC.hp = PC.hp - damage;

            print(enemy.name + " hits dealing " + damage + " damage.");

        }
        else {
            print(enemy.name + " missed their attack.");

        }

    }

    private boolean endFight(Entity enemy, PC PC) throws DiedExeption {
        if(PC.hp <= 0){
            araPrint("You are really pitiful you know.");

            print("You here Ara say right before you die.");

            h.myWait(3000);

            throw new DiedExeption("Well you suck.");
        }
        else if(enemy.hp <= 0){
            if(enemy.name.equals("Ara")){}
            else {
                print(enemy.name + " falls down and slowly starts dieing");
                print("You take you sword and finish him of");
            }
            return false;
        }
        return true;
    }
}
