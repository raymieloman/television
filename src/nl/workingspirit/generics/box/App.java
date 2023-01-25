package nl.workingspirit.generics.box;

import nl.workingspirit.model.Samsung;
import nl.workingspirit.model.Television;

public class App{

    public static void main(String[] args) {
        Box<Television> televisionBox = new Box<>();

        Television tv = new Samsung();
        televisionBox.add(tv);

        // vout
//        televisionBox.add("Sander")

    }
}
