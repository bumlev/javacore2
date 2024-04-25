package Heap;

public class MinHeap {

    private final int[] heap;
    private int size;
    private final int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Adding 1 because heap indices start from 1
    }


    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }

        size++;
        heap[size] = value;
        int current = size;

        // Fixing the min-heap property by bubbling up the newly inserted element
        while (current > 1 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private void swap(int pos1, int pos2) {
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }
}
