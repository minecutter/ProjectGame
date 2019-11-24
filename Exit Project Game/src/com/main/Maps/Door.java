package com.main.Maps;

public class Door extends Wall {
    @Override
    public String toString() {
        return "door";
    }

    public boolean canEnter(){
        return true;
    }
}
