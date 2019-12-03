package com.main;

import com.main.Maps.Level1;

public class StartGame {

    public void startGame(){
        Tutorial tutorial = new Tutorial();
        Helpers h = new Helpers();

        while (true) {
            try {
                if (!(tutorial.start() == false)) break;
            } catch (DiedExeption diedExeption) {
                h.araPrint(diedExeption.getMessage());
                h.myWait(5000);
                continue;
            }
        }

    }

}
