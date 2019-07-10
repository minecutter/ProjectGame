package com.main;

import com.main.Entitys.Player;

import java.util.*;

public class Tutorial {

    protected void print(String... lines) {
        Helpers.print(lines);
    }

    public void start(Player p) {

        print("this is it intro.");
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
                    "test 1",
                    "test 2",
                    "test 50000000000"

                };

        //int i = 0;

        while (true) {

            print("Is this the name your good with.");
            print(p.Name);

            input = Helpers.menu("yes", "no");
            if (input.equals("yes")) {
                print("Ok then");
                print(p.Name);
                break;
            } else if (input.equals("no")) {
                print(Helpers.randomString(snarkyRemarks));
                //print(snarkyRemarks[i]);
                //i++;
                //i %= snarkyRemarks.length; makes the array go one afert the other then loop
                p.Name = Helpers.getInput();
            }

        }
       print("test");
    }






}
