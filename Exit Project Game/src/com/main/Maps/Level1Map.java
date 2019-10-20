package com.main.Maps;

import com.main.Helpers;

public class Level1Map {
    Helpers h = new Helpers();

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}

    private boolean entersFromNorth = false;
    private boolean entersFromEast = false;
    private boolean entersFromSouth = false;
    private boolean entersFromWest = false;

    public void roomA2(){
        print("You are standing outside of the mine.");
        print("Tazron is waiting for you to enter.");

        switch (h.menu("enter")) {
            case "enter":

                print("You walk though the entrance as Tazron closes the entrance behind you.");
                entersFromSouth = true;

                break;
        }
    }

    private void roomB1(){


    }

    private void roomB2(){
        if(entersFromSouth == true){
            entersFromSouth = false;

            print("You enter the mine.");
            print("In front of you is a large iron gate.");
            print("To you right is a large metal door with a lock the size of your hand on it.");
            print("To the left is a open hallway");

        }
        else if(entersFromWest == true){
            entersFromWest = false;
            print("You enter the room.");
            print("In front of you is a large metal door with a lock the size of your hand on it.");
            print("To the left is a large iron gate.");
            print("To the right is the magic wall Tazron made");

        }
        else if(entersFromNorth == true){
            entersFromNorth = false;

            print("You enter the room.");
            print("To you left is a large metal door with a lock the size of your hand on it.");
            print("To the right is a open hallway");
            print("In front of you is the magic wall Tazron made");
        }


    }

    private void roomB3(){


    }
}
