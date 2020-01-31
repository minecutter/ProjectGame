package com.main.Maps;

import com.main.Entitys.Player;
import com.main.Items.Keys.Key;

public class LockedDoor extends Wall {


    public String toString() {

        return "locked door";
    }
    public boolean canEnter(Player player, Key key){
        //TODO
        if(player.inventory.getItemsOfType(Key.class).contains(key)){
            return true;
        }
        else {
            return false;
        }
    }
}
