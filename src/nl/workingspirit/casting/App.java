package nl.workingspirit.casting;

import nl.workingspirit.model.Apple;
import nl.workingspirit.model.Fruit;
import nl.workingspirit.model.Pear;

public class App {
    public static void main(String[] args) {

        // primitive casting
        byte b = 127;
        int c = 4256;
        b = (byte) c;
        System.out.println(b);

        Fruit fruit1 = new Pear();
        fruit1.schillen();


        //reference type casting
        Fruit fruit = new Apple();
        fruit.schillen();

        if (fruit instanceof Apple) {
            Apple apple = (Apple) fruit; // casting ()
            apple.schillen();
        }






    }
}
