package nl.workingspirit.generics.box;

import java.util.ArrayList;
import java.util.List;

public class Box<E> {

    private List<E> content = new ArrayList<>();

    public void add(E element) {
        content.add(element);
    }

    public void pp() {
        for (E element : content) {
            System.out.println(element);
        }
    }

}
