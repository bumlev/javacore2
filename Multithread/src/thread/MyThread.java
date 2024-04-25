package thread;

public class MyThread extends Thread{

    private final String name;

    public MyThread(String name) {
        this.name = name;
    }

    // Executed Method when thread starts

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause de 1 seconde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s ended.%n", name);
    }
}
