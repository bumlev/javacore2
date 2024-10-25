package synchronization;

public class Counter {

    private int count = 0;
    private final Object lock = new Object();

    public synchronized void increment() {
        synchronized (this) { // Alternative syntax for locking on the current object
            count++;
        }
    }

}
