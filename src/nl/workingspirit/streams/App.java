package nl.workingspirit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
         // classic approach
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(2);
        numbers.add(5);
        numbers.add(26);

         numbers.addAll(Arrays.asList(13, 34, 55, 89, 144, 255, 8, 11));

        // print all even numbers using the classic approach
        System.out.println("Classic approach");
        for (int element : numbers) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        // Using Streams
        System.out.println("Using Stream");
        numbers.stream().filter(n -> n %2 == 0).forEach(n -> {
            System.out.println(n);
        });

        // Assign to you all!
        /*
        Create a List with some numbers (odd and even) and filter in the odd numbers and print them!
         */
    }
}
