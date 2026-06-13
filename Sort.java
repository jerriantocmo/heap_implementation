
public class Sort{
    public static int [] heapSort(int arr[]){
        MaxHeap heap = new MaxHeap();
        int sortedArr[] = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            heap.insert(arr[i]);
        }

        for(int i=arr.length-1; i >= 0; i--){
            sortedArr[i] = heap.pop();
        }

        return sortedArr;
    }
}
