package com.main;

import com.main.Entitys.*;
import com.main.Maps.TutorialMap;

public class Main {



    public static void main(String[] args) {

        Player player = new Player("sans");
        Tutorial tutorial = new Tutorial();
        Ara ara = new Ara("Ara");
        Combat combat = new Combat();

        ara.Name = "Ara";



        tutorial.start(player, ara, combat);









    }

}
