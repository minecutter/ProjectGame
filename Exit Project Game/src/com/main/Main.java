package com.main;

import com.main.Entitys.*;
import com.main.Maps.Level;
import com.main.Maps.Level1;
import com.main.Maps.TutorialMap;

public class Main {



    public static void main(String[] args) {

        Level1 level1 = new Level1();

        level1.startLevel();

        Player player = new Player("sans");
        Tutorial tutorial = new Tutorial();
        Ara ara = new Ara("Ara");
        Combat combat = new Combat();

        ara.Name = "Ara";



        tutorial.start(player, ara, combat);









    }

}
