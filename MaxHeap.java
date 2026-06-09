import java.util.ArrayList;

public class MaxHeap {
    protected ArrayList<Integer> heap;

    public int size;

    public MaxHeap() {
        heap = new ArrayList<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected int getLeftChldrenIndex(int index) {
        return 2 * index + 1;
    }

    protected int getRightChildrenIndex(int index) {
        return 2 * index + 2;
    }

    protected int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    protected void insert(int newItem) {
        heap.add(newItem);
        heapifyUp(heap.size() - 1);
        size++;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = getParentIndex(index);
            if (heap.get(parentIndex) < heap.get(index)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    protected int pop() {
        if (isEmpty())
            throw new IllegalStateException("Heap is empty");
        int popValue = heap.get(0);
        heap.remove(0);
        return popValue;
    }

    protected int peek() {
        if (isEmpty())
            throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    protected void print() {
        for (int i = 0; i < heap.size(); i++) {
            System.out.println(heap.get(i));
        }

    }

}
