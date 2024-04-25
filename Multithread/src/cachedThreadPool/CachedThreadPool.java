package cachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {

        // Create a cached thread pool
        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit tasks to the pool
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by thread: " + Thread.currentThread().getName());

            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}

