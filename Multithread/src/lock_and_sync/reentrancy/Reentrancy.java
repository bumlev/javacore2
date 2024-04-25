package lock_and_sync.reentrancy;

public class Reentrancy {

    public static void main(String[] args) {
        Reentrant reentrantExample = new Reentrant();
        reentrantExample.outer();
    }
}
