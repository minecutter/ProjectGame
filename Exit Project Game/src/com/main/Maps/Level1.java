package com.main.Maps;

import com.main.DiedExeption;
import com.main.Entitys.HumanSpearMan;
import com.main.Entitys.Player;
import com.main.Helpers;
import com.main.Items.Keys.Level1Key;

import java.awt.*;

public class Level1 extends Level {



    public Level1(){

        rooms = new Room[][]{
            {new Room(/* Empty*/), new Room(door, wall, door, wall, "(0,1)"), new Room(door, wall, door, door, "(0,2)"), new EnemyRoom(door, wall, door, wall,"(0,3)", new HumanSpearMan(), new Level1Key())},
            {new Room(wall, wall, door, wall, "(1,0)"), new Room(door, door, door, wall, "(1,1)"), new Room(door, door, door, door, "(1,2)"), new Room(door, door, wall, door, "(1,3)")},
            {new Room(/* Empty*/), new Room(lDoor, door,door, wall, "(2,1)", new Level1Key()), new Room(wall, door, door, door, "(2,2)"), new Room(wall, door, wall, door, "(2,2)")},
            {new Room(/* Empty*/), new Room(wall, door, wall, wall, "(3,1)"), new Room(/* Empty*/), new Room(/* Empty*/)}
        };
//        rooms = new Room[][]{
//                {new Room(new Door(), new Wall(), new Door(), new Wall(), "top left"), new Room(new Wall(), new Door(), new Door(), new Wall(), "top right") },
//                {new Room(new Door(), new Wall(), new Wall(), new Door(), "bottom left"), new Room(new Wall(), new Door(), new Wall(), new Door(),"bottom right")}
//        };
        // can chang the new Room to like new TPRoom
        // put possible direction in rooms
        // top left (0,0) top right is (0,3)

        startPoint = new Point(1,0);
        endPoint = new Point(3,1);
        currentDirection = Direction.POSY;

        //POSX, NEGX, POSY, NEGY


    }

    public void startLevel(Player player){
        print("As you step though the portal and a very bright light and a loud rigging in you ears.");
        print("You instinctively cover you eyes as the light and ringing get louder.");
        print("Then suddenly it all stops.");
        print("You open your eyes and you are in a room with what appears to be a large magic circle on the ground beneath your feat.");
        print("As you look around and you see a humanoid creature with the only part that looks wearied is that she has horns on her head.");
        araPrint("That is a demon.");
        araPrint("She must have some how disrupted my teleportation with that magic circle.");
        print("You walk over to the demon and see if she is alive.");
        print("As you look you can tell that she is alive and is just knocked out.");
        print("You have also just noticed that you are wearing a large black cloak and have the sword that you were using earlier.");
        print("Though the door in front of you, you here someone talking though it sound doesn't sound like it is in the next room.");
    }

    public void endLevel(Player player)throws DiedExeption {
        print("You unlock the door and there is about 20 demons in chains.");
        print("You unlock the demons from there chains.");
        print("The demon that was in the room you started in.");
        print("She asks you for your help and her defeat the human king and in exchange you will be retard home.");
        print("She tells you that the king is at the top flor of the demons home and that you are currently on the bottom.");
        print("She shoes you the later and wishes you luck as you go higher into the cave.");

        player.nameCheck();
        new Level2().playLevel(player);

    }
}
