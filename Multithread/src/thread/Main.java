package thread;

public class Main {

    public static void main(String[] args) {

        //Creation of instance de la classe MyThread
        MyThread thread1 =  new MyThread("thread1");
        MyThread thread2 = new MyThread("Thread2");

        // Start of threads
        thread1.start();
        thread2.start();

        //Waiting the end of threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The end of program");

    }
}
