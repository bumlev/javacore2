package Heap;

public class Main {

    public static void main(String[] args) {

        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(8);
        minHeap.insert(7);
        minHeap.insert(9);
        minHeap.insert(6);

        System.out.println("Min-Heap:");
        minHeap.printHeap();
    }
}
