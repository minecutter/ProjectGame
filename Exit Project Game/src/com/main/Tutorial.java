package com.main;

import com.main.Entitys.Player;
import com.main.Entitys.*;
import com.main.Items.Swords.BasicSword;
import com.main.Maps.TutorialMap;

import java.util.*;


public class Tutorial {


    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) {
        Helpers.araPrint(lines);
    }

    public void start(Player p, Ara ara, Combat c, Tutorial t, CombatT ct, TutorialMap tm) {

        System.out.println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m");

        araPrint("This is it intro.");
        print("this is the instructions.");
        print("do you understand?");

        String input = Helpers.menu("yes","no");
            if (input.equals("yes")) {
                print("Good for you.");

            } else if (input.equals("no")) {
                print("really!?");
                print("well to bad");
            }
        print("Lets start with your name.");
        print("So just type it.");

        p.Name = Helpers.getInput();

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

            print(p.Name);

            input = Helpers.menu("yes", "no");
            if (input.equals("yes")) {
                print("Ok then");
                print(p.Name);
                break;
            } else if (input.equals("no")) {
                //print(Helpers.randomString(snarkyRemarks));  //gives random string
                print(snarkyRemarks[i]);

                i++;

                if (i == 5) {
                    i = 4;
                }

//                i %= snarkyRemarks.length; //makes the array go one afert the other then loop
                p.Name = Helpers.getInput();
            }

        }

        print("Ok now that we have that out of the way lets move on to fighting.");

        //adds Sword to inventory
        p.inventory.add(new BasicSword());

        c.start(p,ara);

        print("Now that you have learned how to fight you now need to learn how to move around.");

        tm.roomA1();

    }

}
