package Task3;

import java.util.ArrayList;

public class MyArrayCollection<T> implements MyCollection<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }
    public void remove(T element) {
        list.remove(element);
    }
    public boolean contains(T element) {
        return list.contains(element);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}