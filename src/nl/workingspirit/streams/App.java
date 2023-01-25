package nl.workingspirit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        // classic approach
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(2);
        numbers.add(5);
        numbers.add(26);

        Integer n1 = 3;
        System.out.println(n1 % 2 == 0);

        numbers.addAll(Arrays.asList(13, 34, 55, 89, 144, 255, 8, 11));

        // Glen
        List<Integer> lijst = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

        // print all even numbers using the classic approach
        System.out.println("Classic approach");
        for (int element : numbers) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        // Using Streams
        System.out.println("Using Stream");
        numbers.stream().filter(n -> n % 2 == 1).forEach(n -> {
            System.out.println(n);
        });

        // Assign to you all!
        /*
        Create a List with some numbers (odd and even) and filter in the odd numbers and print them!
         */

        System.out.println("Even numbers larger than 9 squared");
        numbers.stream()
                .filter(n -> n  <10)
                // This is the longer version of n -> n % 2 == 0
                .filter(new MyEvenNumberPredicate())
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}

