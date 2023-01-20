package nl.workingspirit.exceptions;

public class App {

    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            System.out.println(divide(a, b));
        } catch (WorkingSpiritException e) {
            System.out.println(e.getMessage());
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
