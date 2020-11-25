package com.main.Maps;

import com.main.Entitys.PC;
import com.main.Items.Keys.Key;

public class Wall {
    @Override
    public String toString() {
        return "wall";
    }

    public boolean canEnter(PC PC, Key key){
        return false;
    }

    public void enterText(){

    }

}
