package concurrent_collections;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafety {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        System.out.println(map);
        // Multiple threads can safely access and modify the map concurrently

    }
}
