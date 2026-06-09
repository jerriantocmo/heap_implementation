import util.util;

public static void main(String args[]){
    MaxHeap heap = new MaxHeap();
    heap.insert(0);
    heap.insert(30);
    heap.insert(23);
    heap.insert(19);
    heap.print();
    heap.pop();
    util.print("Popped");
    heap.print();
}
