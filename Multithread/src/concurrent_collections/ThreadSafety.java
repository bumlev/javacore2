package concurrent_collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafety {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        System.out.println(map);

        // Multiple threads can safely access and modify the map concurrently

        ExecutorService executor = Executors.newCachedThreadPool();
        for (Map.Entry<String , Integer> entry : map.entrySet()) {
            executor.submit(()->{
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + " executed by thread :" + Thread.currentThread().getName());
            });

        }
        executor.shutdown();
    }
}
