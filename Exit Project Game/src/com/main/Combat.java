package com.main;

import com.main.Entitys.Player;
import com.main.Tutorial;

public class Combat {

    private boolean tutorialLevel = true;

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}


    public void start(Player player, Entity enemy){

        Helpers h = new Helpers();

        if(tutorialLevel == true){
            araPrint("Thea's are the basic steps of combat for idiots that have never plaid games before.");
            araPrint("If you have plaid games before good for you, but I don't care so your getting my long bit of dialog anyway.");
            araPrint("The first command for when you are in combat is ATTACK.");

            Helpers.myWait(200);

            araPrint("What are you expecting a deeper explanation you will literally just attack the target with your sword.");
            araPrint("The second command for when you are in combat is MAGIC.");
            araPrint("When you use this command you will aces your magic list and have to pick the magic you want to use.");
            araPrint("The last command for when you are in combat is ITEM.");
            araPrint("When you use this command you will go into your inventory and see all the items that are useful while in combat.");
        }

        switch (h.menu("attack", "magic", "item")){
            case "attack":

                break;

            case "magic":

                break;
            case "item":

                break;
        }
    }
}
