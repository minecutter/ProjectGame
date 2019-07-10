package com.main;


import java.util.*;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;


public class BasicLevel {

    private Scanner scan = new Scanner(System.in);
    private int levelProgression = 0;
    private boolean coms = false;
    private boolean comsOver = false;


    private String mPName = "Jarod"; //Need to get the public string form Tutorial. This is temp fix.


    public void start() {

        Helpers.print(
                "this is the all ammmasing test of this function",
                "this is the second line of text");

        out.println("You have entered");
        out.println("Daemon City Name");


        checkImpute();
        // Find a way to wait a about of time
    }

//    public void textSlowDown(String... lines) {
//        for (String line: lines) {
//            for (char c: line.toCharArray()) {
//                out.print(c);
//                out.flush();
//                if (c != ' ') {
//                    myWait(100);
//                }
//            }
//            out.println();
//        }
//
//    }

    private void checkImpute() {

        String impute = scan.nextLine();

        if (impute.equals("next")) {
            out.println("You have advanced to the next section.");
            levelProgression += 1;
            out.println(levelProgression);
        }

        else if (impute.equals("talk")) {
            if (coms == true){
                conversation();
            }

            else {
                out.println("No one to speak to.");
            }
        }

        else if (impute.equals("help")) {
            out.println("Inputs include,");
            out.println("next");
            out.println("talk");
            out.println("help or ?");
        }

        else if (impute.equals("?")) {
            out.println("Imputes include,");
            out.println("next");
            out.println("help or ?");
        }

        else {
            out.println("Not valid impute.");
        }

    }
/*
    private void myWait(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (Exception e) { }

    }
*/
    private void conversation() {
        if (comsOver == false) {

            out.println("Hello stranger. I have never sean you around town before, did you just get here?");
            String impute = scan.nextLine();

            if (impute.equals("Yes")) {
                out.println("What is you name stranger?");

                //myWait(3000);

                out.printf("Well hello %s,and welcome to The Monster Cite of ________.\n", mPName);

                out.println(",and welcome to The Monster Cite of ________.");
                out.println("There will be more but this is good for now.");
                comsOver = true;
            }

            else if (impute.equals("Leave")) {
                out.println("Ok just leave then.");
                comsOver = true;
            }
            
            else {
                out.println("Not a valid impute.");
                out.println();
                out.println();
                conversation();
            }
        }

    }
}
