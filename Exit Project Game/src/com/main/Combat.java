package com.main;

import com.main.Entitys.Player;
import com.main.Items.Magic.Magic;
import com.main.Items.Magic.MagicEffect;
import com.main.Items.Swords.Swords;
import com.main.Tutorial;

public class Combat {

    private boolean tutorialLevel = true;

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}
    protected Helpers h = new Helpers();

    public void start(Player player, Entity enemy){

        if(tutorialLevel == true){
            araPrint("Thea's are the basic steps of combat for idiots that have never plaid games before.");
            araPrint("If you have plaid games before good for you, but I don't care so your getting my long bit of dialog anyway.");
            araPrint("The first command for when you are in combat is ATTACK.");

            Helpers.myWait(200);

            araPrint("What are you expecting a deeper explanation you will literally just attack the target with your sword.");
            araPrint("The second command for when you are in combat is MAGIC.");
            araPrint("When you use this command you will aces your magic list and have to pick the magic you want to use.");
            araPrint("");
            tutorialLevel = false;

        }

        while (enemy.hp > 0) {
            switch (h.menu("attack", "magic", "info")) {
                case "attack":
                    attack(player, enemy);

                    break;

                case "magic":
                    magic(player, enemy);

                    break;

                case "info":
                    info(enemy);

                    break;
            }
        }

    }

    private void attack(Player player, Entity enemy){
        Swords s = player.inventory.menu(Swords.class);

        float damage = s.damage * enemy.armor;

        enemy.hp = enemy.hp - damage;

        print("You attack your enemy dealing" + (int)damage + "damage");

    }

    private void magic(Player player, Entity enemy){
        Magic m = player.inventory.menu(Magic.class);
        if (m.effect == MagicEffect.ENEMY){
            enemy.hp = enemy.hp - m.damage;

            print("");

        }
        else if(m.effect == MagicEffect.SELF){
            player.hp = player.hp + m.damage;
        }

    }

    private void info(Entity enemy){
        araPrint(enemy.infoText);

    }

}
