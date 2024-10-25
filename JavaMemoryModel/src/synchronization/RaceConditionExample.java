package synchronization;

import raceCondition.Counter;

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        raceCondition.Counter counter = new Counter();
        int numThreads = 1000;

        // Simulate multiple threads incrementing the counter concurrently
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> counter.increment());
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Expected count: " + numThreads);
        System.out.println("Actual count: " + counter.count);
    }

    /**
     * In this example, the increment method is now synchronized.
     * This ensures that only one thread can enter the critical
     * section (the code block within the synchronized block) at a time.
     * This prevents race conditions and ensures the count variable is
     * incremented atomically (as a single operation).
     */

}
