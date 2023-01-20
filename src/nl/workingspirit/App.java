package nl.workingspirit;

import nl.workingspirit.model.Samsung;
import nl.workingspirit.model.Television;

public class App {

    public static void main(String[] args) {

        Television tv = new Samsung();

        // design smell
        if (tv instanceof Samsung) {
            Samsung samsung = (Samsung) tv;
            samsung.foo();
        }

    }

}
