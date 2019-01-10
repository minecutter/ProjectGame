package com.main;

import java.util.*;

public class LevelPlayer {

    private Scanner scan = new Scanner(System.in);

    public void levelSelect() {
        //levelImput();
        updateUserInput();
    }
    /*
    private void levelImput();{
        updateUserInput();


    }
    */
    private void updateUserInput() {
        System.out.println("Enter command");
        String inpute = scan.nextLine();
        if (inpute.equals("next")){
            System.out.println("good");

        }
        if (inpute.equals("good")){
            System.out.println("good");

        }
        if (inpute.equals("equip")){
            System.out.println("good");

        }
        else {
            System.out.println("Not a valid command");
        }
    }
}
