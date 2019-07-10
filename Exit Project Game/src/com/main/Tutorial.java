package com.main;

import com.main.Entitys.Player;

import java.util.*;

public class Tutorial {
    private boolean state = true;

    private static final Scanner scan = new Scanner(System.in);

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
       NameQuestion(p,input);
       print("test");
    }

    private void NameQuestion(Player p,String input){
        p.Name = scan.nextLine();

        print("Is this the name your good with.");
        print(p.Name);

        input = Helpers.menu("yes", "no");
            if(input.equals("yes")){
            print("Ok then");
            }
            else if (input.equals("no")){
            print("Ok then what is it.");
            }
    }



}
