package nl.workingspirit.exceptions;

import nl.workingspirit.model.Apple;
import nl.workingspirit.model.Fruit;
import nl.workingspirit.model.Pear;

public class App {

    public static void main(String[] args) {
        int a = 3;
        int b = 1;

        System.out.println(divide(a, b));


        try {
            System.out.println(divide(a, b));
            Fruit fruit = new Pear();
//            Apple apple = (Apple) fruit;

            String age = "poedel";
            int ageAsInt = Integer.parseInt(age);
            System.out.println(ageAsInt + 2);
            // multi catch block
        } catch (WorkingSpiritException | ClassCastException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Andere exception afgehandeld");
        } finally {
            System.out.println("Dit block wordt ALTIJD uitgevoerd, tenzij je de stroom uitzet of System.exit");
        }
        System.out.println("Einde programma");
    }

    public static int divide(int a, int b) throws WorkingSpiritException {
        if (b != 0) {
            return a / b;
        } else {
            throw new WorkingSpiritException("b mag niet 0 zijn");
        }
    }
}
