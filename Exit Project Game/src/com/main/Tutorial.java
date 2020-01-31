package com.main;

import com.main.Entitys.Player;
import com.main.Entitys.*;
import com.main.Items.Magic.FireShot;
import com.main.Items.Swords.BasicSword;
import com.main.Items.Swords.GasterBlaster;
import com.main.Items.Swords.GoodSword;
import com.main.Maps.Level1;
import com.main.Maps.TutorialMap;

import java.util.*;


public class Tutorial {


    Helpers h = new Helpers();
    TutorialMap tutorialMap = new TutorialMap();
    Combat combat = new Combat();
    Ara ara = new Ara();

    protected void print(String... lines) {
        h.print(lines);
    }
    protected void araPrint(String... lines) {
        h.araPrint(lines);
    }

    public boolean start(Player player) throws DiedExeption{

//      how to color text
//      System.out.println("\033[31mRed\033[32m, Green\033[33m, Yellow\033[34m, Blue\033[0m");

        araPrint("Welcome to this game and bla bla bla.");
        araPrint("My name is Ara and I am the god of this place which sadly has to deal with you.");
        araPrint("To respond either type the number next to the prompted you receive or fully type out our selection.");
        araPrint("Do you understand?");

        String input = h.menu("yes","no");
            if (input.equals("yes")) {
                araPrint("Good for you.");

            } else if (input.equals("no")) {
                araPrint("really!?");

            }
        araPrint("Lets start with your name.");
        araPrint("So just type it.");

        player.name = h.getInput();

        if (nameCheck(player) == false){
            return false;
        }

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
                print(player.name);
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

        combat.start(ara, player);

        player.inventory.add(new GoodSword());
        player.inventory.remove(new BasicSword());

        araPrint("Now that you have learned how to fight you now need to learn how to move around.");

        tutorialMap.roomA1();

        araPrint("All right now that that shit is out of the way i can finally get you out of my home.");
        print("Ara starts to make what looks like a portal.");
        print("She then proceeds to push you though the portal with much more strength then a person of that size could actually use.");
        araPrint("Good now that you are though I will send you to the humans now.");

        new Level1().playLevel(player);
        return true;
    }

    private boolean nameCheck(Player player){
        if(player.name.toLowerCase().equals("sans")){
            player.inventory.add(new GasterBlaster());
            player.sansStats();
        }
        else if(player.name.toLowerCase().equals("jarod")){
            return false;
        }
        else if(player.name.toLowerCase().equals("logan")){
            player.name = "Not very helpful";
            player.loganStats();
        }
        else if(player.name.toLowerCase().equals("teemo")){
            player.name = "Cancer";
        }
        return true;
    }

}
