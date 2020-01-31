package com.main.Maps;

import com.main.Entitys.Player;
import com.main.Items.Keys.Key;

public class Wall {
    @Override
    public String toString() {
        return "wall";
    }

    public boolean canEnter(Player player, Key key){
        return false;
    }

    public void enterText(){

    }

}
