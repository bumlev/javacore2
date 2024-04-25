package lock_and_sync.reentrancy;

public class Reentrant {

    public synchronized void outer() {
        inner();
        System.out.println("Outer method");
    }

    public synchronized void inner() {
        System.out.println("Inner method");
    }
}
