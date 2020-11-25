package com.main.Maps;

import com.main.Entitys.PC;
import com.main.Items.Keys.Key;

public class Door extends Wall {
    @Override
    public String toString() {
        return "door";
    }

    public boolean canEnter(PC PC, Key key){
        return false;
    }
}
