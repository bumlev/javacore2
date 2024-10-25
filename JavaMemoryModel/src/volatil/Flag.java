package volatil;

public class Flag {

    private volatile boolean stop = false;

    public void setStop() {
        stop = true;
    }

    public boolean shouldStop() {
        return stop;
    }

    /**
     * In this example, the stop variable is declared
     * as volatile. This ensures that changes to stop in the setStop method
     * become visible to other threads immediately, even if
     * they haven't flushed their working memory caches.
     * This can be useful for signaling events or termination conditions between threads.
     */

}
