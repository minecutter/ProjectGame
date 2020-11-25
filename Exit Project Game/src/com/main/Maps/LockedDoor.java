package com.main.Maps;

import com.main.Entitys.PC;
import com.main.Items.Keys.Key;

public class LockedDoor extends Wall {


    public String toString() {

        return "locked door";
    }
    public boolean canEnter(PC PC, Key key){
        //TODO
        if(PC.inventory.getItemsOfType(Key.class).contains(key)){
            return true;
        }
        else {
            return false;
        }
    }
}
