package recursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {

    private final int n;

    public Fibonacci(int n){
        this.n= n;
    }

    @Override
    protected Integer compute(){

        if(n <= 1)
            return n;

        Fibonacci task1 = new Fibonacci(n-1);
        task1.fork();

        Fibonacci task2 = new Fibonacci(n-2);
        task2.fork();

        return task1.join() + task2.join();
    }

    public static void main(String[] args){

        ForkJoinPool pool = new ForkJoinPool();

        int number = 40; // Adjust this number as needed

        Fibonacci task = new Fibonacci(number);
        int result = pool.invoke(task);
        System.out.println("Fibonnacci of " + number + " is :" +result);
    }
}
