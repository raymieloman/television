package nl.workingspirit.streams;

import java.util.function.Predicate;

public class MyEvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer n) {
        return n  % 2 == 0;
    }
}
