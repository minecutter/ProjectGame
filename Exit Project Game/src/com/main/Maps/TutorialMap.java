package com.main.Maps;

import com.main.Helpers;

public class TutorialMap {
    Helpers h = new Helpers();

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected void araPrint(String... lines) { Helpers.araPrint(lines);}


    public void roomA1() {

        boolean chestEmpty = false;

        print("Suddenly a large open room appears around you.");
        print("In the room you see what looks like a chest to the right of you and in front of you is a large door.");

        print("To the left of you Ara is standing there waiting for you to do something.");


        switch (h.menu("forward","back","left","right","search"))
        {
            case "forward":

                print("You walk up to the door and push on it.");
                print("There are no problems opening the door.");
                print("It slides easily without problems");
                print("You walk into the next room.");

                roomB1();

                break;
            case "back":

                print("You turn around and all you see is a black nothingness.");
                print("You look back the other way and notes that the room is gone.");
                print("It feels like the nothingness is closing in on you trying to crush you.");
                print("You blink you eyes and the room is suddenly back as if you had never left.");
                araPrint("Why are you just standing?");
                araPrint("Just do something this is getting boring");

                break;
            case "left":

                print("You walk to the right towards Ara.");
                print("Ara seams slightly surprised by this.");
                araPrint("There is nothing over here you know.");
                araPrint("So go somewhere else.");


                break;
            case "right":

                print("You walk up to the chest.");

                if (chestEmpty == false) {

                    print("Will you open it?");

                    switch (h.menu("yes", "no")) {
                        case "yes":
                            print("You have obtained unreadable note");
                            print("You find a note inside.");
                            print("It is whiten in a language you do not understand");

                            chestEmpty = true;

                            break;
                        case "no":

                            print("you did not open the chest.");

                            break;
                    }
                }
                else {

                    araPrint("Why are you looking at it again.");

                    araPrint("Are you an idiot");
                }

                break;
            case "search":

                h.searchRoom(false);

                print("As you get up Ara looks annoyed");
                araPrint("Stop goofing around.");

                break;
        }
    }

    private void roomB1(){

        print("In the next room you see walls to the right and left of you, and in front of you is another large door.");

        switch (h.menu("forward","back","left","right","search"))
        {
            case "forward":

                roomC1();

                break;
            case "back":

                print("You turn around and you see Ara standing in the doorway.");
                print("You think she is not going to let you pass.");

                break;
            case "left":

                print("You look to the left and you see a wall.");
                print("");

                h.myWait(300);

                print("That all that is there.");

                break;
            case "right":

                print("You look to the right and you see a wall.");
                print("");

                h.myWait(300);

                print("That all that is there.");

                break;
            case "search":

                print("You start searching the room");
                print(" ");

                h.myWait(300);

                print("You find nothing.");
                print("As you get up Ara looks annoyed");
                araPrint("Stop goofing around.");

                break;
        }
    }

    private void roomC1(){

        print("As you walk into the next room you see a walls on both the right and in front of you.");
        print("To the left is a large white hole.");

        switch (h.menu("forward","back","left","right","search"))
        {
            case "forward":

                print("You look in front of you and you see a wall.");
                print("");

                h.myWait(300);

                print("That all that is there.");

                break;
            case "back":

                print("You turn around and you see Ara standing in the doorway.");
                print("You think she is not going to let you pass.");

                break;
            case "left":

                print("You look to the right and you see a wall.");
                print("");

                h.myWait(300);

                print("That all that is there.");

                break;
            case "right":

                break;
            case "search":

                print("You start searching the room");
                print(" ");

                h.myWait(300);

                print("You find nothing.");
                print("As you get up Ara looks annoyed");
                araPrint("Stop goofing around you almost done.");

                break;
        }
    }






}
