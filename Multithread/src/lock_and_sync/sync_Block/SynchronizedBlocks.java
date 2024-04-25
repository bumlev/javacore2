package lock_and_sync.sync_Block;

public class SynchronizedBlocks {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        MyThread thread1 = new MyThread(sharedResource);
        MyThread thread2 = new MyThread(sharedResource);

        thread1.start();
        thread2.start();
    }
}
