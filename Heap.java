import util.util;
import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public void insert(int newItem) {
        heap.add(newItem);
    }

    public void pop() {
        heap.remove(heap.size() - 1);
    }

    private int findMax() {
        return heap.get(0);
    }

    private int size() {
        return heap.size();
    }

    public void print() {
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));
        }

    }

}
