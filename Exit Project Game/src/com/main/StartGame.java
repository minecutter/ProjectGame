package com.main;

import com.main.Entitys.PC;

public class StartGame {

    public void startGame(){
        Tutorial tutorial = new Tutorial();
        Helpers h = new Helpers();
        PC p = new PC();

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
