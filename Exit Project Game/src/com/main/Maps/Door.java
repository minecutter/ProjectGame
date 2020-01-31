package com.main.Maps;

import com.main.Entitys.Player;
import com.main.Items.Keys.Key;

public class Door extends Wall {
    @Override
    public String toString() {
        return "door";
    }

    public boolean canEnter(Player player, Key key){
        return false;
    }
}
