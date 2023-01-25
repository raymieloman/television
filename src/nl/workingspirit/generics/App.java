package nl.workingspirit.generics;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Timo");
        names.add("Roger");
        names.add("Gideon");

        // vout
        /*
        Television samsung = new Samsung();
        names.add(samsung);
        names.add(3)
         */

        for (String name : names) {
            System.out.println(name);
        }

    }
}
