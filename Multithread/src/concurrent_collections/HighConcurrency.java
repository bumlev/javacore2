package concurrent_collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class HighConcurrency {

    public static void main(String[] args) {

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(1);
        queue.offer(2);
        System.out.println(queue);
        // Multiple threads can add/remove elements concurrently without explicit synchronization

    }
}
