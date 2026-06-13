import util.util;

public static void main(String args[]){
    MaxHeap heap = new MaxHeap();
    heap.insert(0);
    heap.insert(30);
    heap.insert(23);
    heap.insert(19);
    heap.insert(45);
    heap.insert(1993);
    heap.insert(-2);
    heap.insert(4);
    heap.insert(-54);
    int heapSize = heap.getSize();
    for(int i=0; i<heapSize; i++){
        System.out.println(heap.pop() + " ,");
    }

    int arr[] = {9, 3, 5, 23, -2, 0, 19, 22};
    for(int i: arr){
        System.out.print(i + ", ");
    }

    Sort s = new Sort();
    System.out.println();

    for(int i: s.heapSort(arr)){
        System.out.print(i + ", ");
    }
    System.out.println();
}
