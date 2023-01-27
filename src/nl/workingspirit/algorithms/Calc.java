package nl.workingspirit.algorithms;

public final class Calc {


    public static boolean divisibleBySeven(int n) {
        // recursion first the base case
        if(n < 10) {
            return n == 7;
        }
        // recursive case
        return divisibleBySeven(3*(n / 10) + n % 10);
    }


    public static void main(String[] args) {
        System.out.println(divisibleBySeven(7));
        System.out.println(divisibleBySeven(14));
        System.out.println(divisibleBySeven(21));
        System.out.println(divisibleBySeven(42));

        System.out.println(divisibleBySeven(29));
    }



    private Calc() {

    }
}
