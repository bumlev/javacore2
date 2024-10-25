package raceCondition;

public class Counter {

    public int count = 0;

    public void increment() {
        count++; // This can lead to a race condition
    }

}
