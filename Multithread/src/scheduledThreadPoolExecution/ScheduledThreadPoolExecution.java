package scheduledThreadPoolExecution;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecution {
    public static void main(String[] args) {

        // Create a scheduled thread pool with 2 threads
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        // Task to be executed after 5 seconds
        Runnable delayedTask = () -> {
            System.out.println("Delayed task executed");
        };

        // Task to be executed every 3 seconds
        Runnable periodicTask = () -> {
            System.out.println("Periodic task executed");
        };

        // Schedule the delayed task to run after 5 seconds
        executor.schedule(delayedTask, 5, TimeUnit.SECONDS);

        // Schedule the periodic task to run every 3 seconds, starting after an initial delay of 1 second
        executor.scheduleAtFixedRate(periodicTask, 1, 3, TimeUnit.SECONDS);

        // Shutdown the executor after 20 seconds
        executor.schedule(() -> executor.shutdown(), 20, TimeUnit.SECONDS);
    }
}

