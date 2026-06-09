import util.util;

public static void main(String args[]){
    Heap heap = new Heap();
    heap.insert(0);
    heap.insert(30);
    heap.insert(23);
    heap.insert(19);
    heap.print();
    heap.pop();
    util.print("Popped");
    heap.print();
}
