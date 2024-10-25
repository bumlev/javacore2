package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueuing items into the queue
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: " + queue);

        // Dequeuing an item from the queue
        String firstItem = queue.poll();
        System.out.println("Dequeued: " + firstItem);
        System.out.println("Queue after dequeue: " + queue);

        // Peeking at the front item without removing it
        String nextItem = queue.peek();
        System.out.println("Front of the queue: " + nextItem);
        System.out.println("Queue after peek: " + queue);
    }
}
