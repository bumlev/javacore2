package singleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            System.out.println("Task 1");
        });
        executor.submit(() -> {
            System.out.println("Task 2");
        });
        executor.shutdown();
    }
}
