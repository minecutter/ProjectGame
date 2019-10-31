package com.main;

import com.main.Entitys.Player;
import com.main.Entitys.*;
import com.main.Items.Magic.FireShot;
import com.main.Items.Swords.BasicSword;
import com.main.Maps.TutorialMap;

import java.util.*;


public class Tutorial {


    Helpers h = new Helpers();
    TutorialMap tutorialMap = new TutorialMap();

    protected void print(String... lines) {
        h.print(lines);
    }
    protected void araPrint(String... lines) {
        h.araPrint(lines);
    }

    public void start(Player player, Ara ara, Combat combat) {

//      how to color text
        System.out.println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m");

        araPrint("This is it intro.");
        araPrint("this is the instructions.");
        araPrint("do you understand?");

        String input = h.menu("yes","no");
            if (input.equals("yes")) {
                araPrint("Good for you.");

            } else if (input.equals("no")) {
                araPrint("really!?");
                araPrint("well to bad");
            }
        araPrint("Lets start with your name.");
        araPrint("So just type it.");

        player.name = h.getInput();

        Random r = new Random();

        String[] snarkyRemarks = new String[]{
                    "Ok then what is it.",
                    "Well what is it.",
                    "I don't have all day.",
                    "I am dun repeating my self.",
                    "                 "
                };

        int i = 0;

        while (true) {

            if (i != 4) {
                araPrint("Is this the name your good with.");
            }

            araPrint(player.name);

            input = h.menu("yes", "no");
            if (input.equals("yes")) {
                araPrint("Ok then");
                araPrint(player.name);
                break;
            } else if (input.equals("no")) {
                //araPrint(Helpers.randomString(snarkyRemarks));  //gives random string
                araPrint(snarkyRemarks[i]);

                i++;

                if (i == 5) {
                    i = 4;
                }

//                i %= snarkyRemarks.length; //makes the array go one after the other in a loop
                player.name = h.getInput();
            }

        }

        araPrint("Ok now that we have that out of the way lets move on to fighting.");

        //adds Sword to inventory
        player.inventory.add(new BasicSword());
        player.inventory.add(new FireShot());

        combat.start(player,ara);

        araPrint("Now that you have learned how to fight you now need to learn how to move around.");

        tutorialMap.roomA1();

    }

}
