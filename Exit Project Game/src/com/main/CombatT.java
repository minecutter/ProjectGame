package com.main;

public class CombatT {

    protected void print(String... lines) {
        Helpers.print(lines);
    }

    public void start() {

        print("Thea's are the basic steps of combat for idiot that have never plaid games before.");
        print("If you have plaid games before good for you, but I don't care so your getting my long bit of dialog anyway.");
        print("The first command for when you are in combat is ATTACK.");

        Helpers.myWait(200);

        print("What are you expecting a deeper explanation you will literally just attack the target");


    }

}
