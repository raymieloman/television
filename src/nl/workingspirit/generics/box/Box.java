package nl.workingspirit.generics.box;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<E> implements Iterable<E> {

    // Delegation Pattern. Third party wrapping
    private List<E> content = new ArrayList<>();

    public boolean add(E e) {
        return content.add(e);
    }

    public void clear() {
        content.clear();
    }

    public E get(int index) {
        return content.get(index);
    }

    public E remove(int index) {
        return content.remove(index);
    }

    @Override
    public Iterator<E> iterator() {
        return content.iterator();
    }
}
