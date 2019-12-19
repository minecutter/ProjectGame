package com.main;

import com.main.Items.Magic.Magic;
import com.main.Items.Swords.BasicSword;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Inventory {

    protected void print(String... lines) {
        Helpers.print(lines);
    }
    protected Helpers h = new Helpers();

    List<Item> items = new ArrayList<Item>();

    public void add(Item i) {
        items.add(i);
    }

    public void remove(Item i) {
        items.remove(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Item i : items) {
            sb.append(i.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public <T extends Item> List<T> getItemsOfType(Class<T> fType) {
        List<T> list = new ArrayList<T>();
        for (Item item : items) {
            if (fType.isAssignableFrom(item.getClass())) {
                list.add(fType.cast(item));
            }
        }
        return list;
    }

    public <T extends Item> T menu(Class<T> fType) {
        List<T> tItems = getItemsOfType(fType);

        return fType.cast(h.menu(tItems.toArray()));
    }
}


