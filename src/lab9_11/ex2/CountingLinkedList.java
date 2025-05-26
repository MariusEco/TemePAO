package lab9_11.ex2;

import java.util.*;

class CountingLinkedList extends LinkedList<Integer> {
    private int totalElementsAdded = 0;

    @Override
    public boolean add(Integer num) {
        totalElementsAdded++;
        return super.add(num);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        totalElementsAdded += c.size();
        return super.addAll(c);
    }

    public int getTotalElementsAdded() {
        return totalElementsAdded;
    }
}