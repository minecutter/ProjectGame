package com.main;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

import static java.lang.System.in;
import static java.lang.System.out;

public final class Helpers {

    public static void snarkyRemarksRandom(){

        String[] snarkyRemarksString = new String[]{
                "Ok then what is it.",
                "Well what is it.",
                "I don't have all day.",
                "I am dun repeating my self.",
                "                 "
        };

        print(Helpers.randomString(snarkyRemarksString));

    }

    private static final Scanner scan = new Scanner(System.in);

//      private static final int textWait = 100;  switch this back
      private static final int textWait = 10;

    public static void print(String... lines) {
        for (String line: lines) {
            for (char c: line.toCharArray()) {
                out.print(c);
                out.flush();
                if (c != ' ') {
                    myWait(textWait);
                }
            }
            out.println();
        }

    }

    public static void araPrint(String... lines) {
        lines[0] = "\033[31m" + lines[0];

        lines[lines.length - 1] =  lines[lines.length - 1] + "\033[0m";

        print(lines);


    }


    public static void myWait(long millis){
        try {
            Thread.sleep(millis);
        }
        catch (Exception e) { }

    }

    public static int randomNumber(int minNumber, int maxNumber){
        Random r = new Random();

        int randomNumber = r.nextInt(maxNumber - minNumber + 1);
        int finalNumber = randomNumber + minNumber;

        return finalNumber;
    }

    public static boolean randomBoolean(){
        return Math.random() < 0.5;

    }

    public static <T> T menu(T... items) {

        for (int i = 1; i <= items.length; i++){
            out.println(i + ": " + items[i-1].toString());
        }

        while (true){
            String input = scan.nextLine();

            try {
                int index = Integer.parseInt(input);

                if (index <= 0 || index > items.length){
                    araPrint("That's not a good number dummy.");
                    continue;
                }

                return items[index - 1];

            } catch (NumberFormatException e){
                for (int i = 0; i < items.length; i++){
                    if (items[i].toString().equals(input)){
                        return items[i];
                    }
                }

                araPrint("That's nothing dummy.");

            }

        }
    }

    public static String getInput(){
        return scan.nextLine();
    }

    public static String randomString(String[] array){
        return array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];

    }

    public static void searchRoom(boolean roomstat){

        print("You start searching the room");
        print(" ");

        myWait(300);
        if(roomstat == false) {
            print("You find nothing.");
        }
        else if(roomstat == true){
            print("You have found");
        }
    }
}
