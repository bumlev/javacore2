package commonFunctionalInterfaces.consumer;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("Hello");
    }
}
