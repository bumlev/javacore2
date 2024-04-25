package concurrent_collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class PerformanceOpt {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("item1");
        list.add("item2");

        System.out.println(list);
        // Iterating over the list is thread-safe and does not require external synchronization

    }
}
