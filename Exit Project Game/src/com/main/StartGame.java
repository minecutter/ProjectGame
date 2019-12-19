package com.main;

import com.main.Entitys.Player;
import com.main.Maps.Level1;

public class StartGame {

    public void startGame(){
        Tutorial tutorial = new Tutorial();
        Helpers h = new Helpers();
        Player p = new Player();

        while (true) {
            try {
                if (!(tutorial.start(p) == false)) break;
            } catch (DiedExeption diedExeption) {
                h.araPrint(diedExeption.getMessage());
                h.myWait(5000);
                continue;
            }
        }

    }

}
