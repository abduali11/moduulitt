package moduuli5_2;

import java.util.ArrayList;

public class Arraylist<A> {
    private final ArrayList<A> list = new ArrayList<>();

    public synchronized void addElement(A element) {
        list.add(element);
    }

    public synchronized void removeElement(A element) {
        list.remove(element);
    }

    public synchronized int getSize() {
        return list.size();
    }
}