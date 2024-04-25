package multithreads;

class PrintNumbers {
    private static final Object lock = new Object();
    private static boolean isThread1Turn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintTask("Thread 1"));
        Thread thread2 = new Thread(new PrintTask("Thread 2"));

        thread1.start();
        thread2.start();
    }

    static class PrintTask implements Runnable {
        private final String threadName;

        public PrintTask(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (lock) {
                    while ((threadName.equals("Thread 1") && !isThread1Turn) ||
                            (threadName.equals("Thread 2") && isThread1Turn)) {
                        try {
                            lock.wait(); // Wait until it's this thread's turn
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println(threadName + ": " + i);

                    isThread1Turn = !isThread1Turn;
                    lock.notify(); // Notify other thread to wake up
                }
            }
        }
    }
}

