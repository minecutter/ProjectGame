package com.main;


import java.util.*;

import static java.lang.System.out;


public class BasicLevel {

    private Scanner scan = new Scanner(System.in);
    private int levelProgression = 0;
    private boolean coms = false;
    private boolean comsOver = false;


    private String mPName = "Jarod"; //Need to get the public string form Tutorial. This is temp fix.

    private step s1 = new step();
    private step s2 = new step();
    private step s3 = new step();

    public void start() {
        out.println("You have entered");
        out.println("Monster City");

        // Find a way to wait a about of time

       s1.map.put("s2", this::s2Action);
        s1.map.put("s3", this::s3Action);

    }

    public void s1Action() {

    }

    public void s2Action() {

    }

    public void s3Action() {

    }

    private void checkImpute() {
        /*
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
    */
    }

    private void conversation() {
        if (comsOver == false) {

            out.println("Hello stranger. I have never sean you around town before, did you just get here?");
            String impute = scan.nextLine();

            if (impute.equals("Yes")) {
                out.println("What is you name stranger?");
                //sleep 3 sec
                out.println("Well hello")(mPName)(",and welcome to The Monster Cite of ________.");
                out.println(mPName);
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
