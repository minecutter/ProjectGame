package com.main;

import com.main.Entitys.Player;
import com.main.Entitys.*;
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
        print("this is the instructions.");
        print("do you understand?");

        String input = h.menu("yes","no");
            if (input.equals("yes")) {
                print("Good for you.");

            } else if (input.equals("no")) {
                print("really!?");
                print("well to bad");
            }
        print("Lets start with your name.");
        print("So just type it.");

        player.Name = h.getInput();

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
                print("Is this the name your good with.");
            }

            print(player.Name);

            input = h.menu("yes", "no");
            if (input.equals("yes")) {
                print("Ok then");
                print(player.Name);
                break;
            } else if (input.equals("no")) {
                //print(Helpers.randomString(snarkyRemarks));  //gives random string
                print(snarkyRemarks[i]);

                i++;

                if (i == 5) {
                    i = 4;
                }

//                i %= snarkyRemarks.length; //makes the array go one after the other in a loop
                player.Name = h.getInput();
            }

        }

        print("Ok now that we have that out of the way lets move on to fighting.");

        //adds Sword to inventory
        player.inventory.add(new BasicSword());

        combat.start(player,ara);

        print("Now that you have learned how to fight you now need to learn how to move around.");

        tutorialMap.roomA1();

    }

}
