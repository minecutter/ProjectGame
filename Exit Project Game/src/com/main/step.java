package com.main;
import java.util.*;

import static java.lang.System.out;

public class step {

       public Map<String, Runnable> map = new HashMap<String, Runnable>();

        public void run(String comand) {
            Runnable r = map.get(comand);
            if (r != null) {
                out.println("Command not valid");
                //finish later print commands
            }

            else {
                r.run();
            }

    }

}
