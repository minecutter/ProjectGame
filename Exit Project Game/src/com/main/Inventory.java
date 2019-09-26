package com.main;

import com.main.Items.Swords.BasicSword;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Item> items = new ArrayList<Item>();

    public void add(Item i){
        items.add(i);
    }

    public void remove(Item i){
        items.remove(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Item i : items){
            sb.append(i.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
