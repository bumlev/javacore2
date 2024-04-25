package concurrent_collections;

import java.util.concurrent.ConcurrentSkipListSet;

public class Scalability {

    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("element1");
        set.add("element2");
        System.out.println(set);
        // Thread-safe set supporting high concurrency with efficient access and modification

    }
}
