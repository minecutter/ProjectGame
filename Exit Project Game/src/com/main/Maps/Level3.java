package com.main.Maps;

import com.main.Entitys.HumanRoalGard;
import com.main.Entitys.KingWarstone;
import com.main.Entitys.PC;
import com.main.Helpers;

import java.awt.*;

public class Level3 extends Level {
    public Level3() {


        rooms = new Room[][]{
                {new EnemyRoom(wall, wall, door, wall,"(0,0)", new HumanRoalGard()), new EnemyRoom(wall, wall, door, door,"(0,1)", new HumanRoalGard()), new EnemyRoom(wall, wall, door, door,"(0,2)", new HumanRoalGard()), new EnemyRoom(wall, wall, door, door,"(0,3)", new KingWarstone()), new Room(wall, wall, wall, door, "(0,4)")}
        };

        startPoint = new Point(0,0);
        endPoint = new Point(0,4);
        currentDirection = Direction.POSY;

    }

    public void endLevel(PC PC){
        print("After killing King Warstone the demon that summon you sent you back to Ara.");
        araPrint("Well I gees there is nothing left for you here considering you are at the end of the game so just leave me alone and never come back.");
        araPrint("It is way to much work for me to do everything I have done for you.");
        araPrint("I almost forgot I need to show you the credits.");
        araPrint("Give me a second to find them.");

        new Helpers().myWait(3000);

        araPrint("Here they are.");
        print("//TODO Put credits here");

        print("You look at Ara which has a dumbfounded expiation on her face.");
        new Helpers().myWait(5000);

        araPrint("That Mother F***** didn't even add credits.");
        araPrint("This game already sucks but why did not even bother with the F****** credits.");
        print("You fade out of existence as you here Ara ranting about someone you don't know.");
    }
}
