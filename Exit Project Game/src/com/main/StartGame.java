package com.main;

import com.main.Maps.Level1;

public class StartGame {

    public void startGame(boolean newGame){
        Level1 level1 = new Level1();
        Tutorial tutorial = new Tutorial();

        level1.playLevel();

        if(newGame == true) {
            tutorial.start();

        }
        else if(newGame == false){
            level1.playLevel();

        }


    }
}
