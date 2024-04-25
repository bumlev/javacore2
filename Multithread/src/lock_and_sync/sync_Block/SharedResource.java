package lock_and_sync.sync_Block;

public class SharedResource {

    private int sharedVariable;

    public void synchronizedMethod() {

        // Synchronized method
        synchronized (this) {
            //critical
            sharedVariable++;
            System.out.println("Incremented sharedVariable: " + sharedVariable);
        }
    }
}
