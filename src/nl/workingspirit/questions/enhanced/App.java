package nl.workingspirit.questions.enhanced;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers =  Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);

// to answer the question if break works in enhanced for. yes.
        for (Integer element : numbers) {
            System.out.println( element % 2);
            if (element == 13) {
                break;
            }
            System.out.println(element);
        }
    }
}
