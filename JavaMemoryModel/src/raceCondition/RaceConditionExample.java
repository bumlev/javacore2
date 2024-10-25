package raceCondition;

public class RaceConditionExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
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
     * Explanation:
     * The Counter class has a private count variable and an increment method that simply increments the count.
     * The RaceConditionExample creates a counter and multiple threads.
     * Each thread calls counter.increment(), attempting to increase the count.
     * Due to lack of synchronization, multiple threads might try to read and update the count variable
     * at the same time, leading to a race condition. The final count value might be less than
     * expected (not all increments are reflected) because of incorrect interleaving of instructions.
     */

}
