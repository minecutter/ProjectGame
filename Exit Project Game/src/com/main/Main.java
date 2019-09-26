package com.main;

import com.main.Entitys.*;
import com.main.Maps.TutorialMap;

public class Main {



    public static void main(String[] args) {

        Player p = new Player("sans");
        Tutorial t = new Tutorial();
        Ara ara = new Ara("Ara");
        Combat c = new Combat();
        CombatT ct = new CombatT();
        TutorialMap tm = new TutorialMap();

        ara.Name = "Ara";



        t.start(p, ara, c, t, ct, tm);









    }

}
