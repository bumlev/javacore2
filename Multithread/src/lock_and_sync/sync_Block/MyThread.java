package lock_and_sync.sync_Block;

public class MyThread extends  Thread {

    private final SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.synchronizedMethod();
    }
}
