package com.main;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.out;

public final class Helpers {



    private static final Scanner scan = new Scanner(System.in);

//      private static final int textWait = 100;
      private static final int textWait = 10;

    public static void print(String... lines) {
        for (String line: lines) {
            for (char c: line.toCharArray()) {
                out.print(c);
                out.flush();
                if (c != ' ') {
                    myWait(textWait);
                }
            }
            out.println();
        }

    }

    private static void myWait(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (Exception e) { }

    }

    public static String menu(String... items) {

        for (String item: items) {
            out.println("- " + item);

        }

        while (true){
            String input = scan.nextLine();

            if (Arrays.asList(items).contains(input)){
                return input;
            }
            else {
                print("that command won't work dummy");
            }
        }
    }

    public static String getInput(){
        return scan.nextLine();
    }

    public static String randomString(String[] array){
        return array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];

    }
}
