package collectionsFramework.ConcurrentCollections;

public class Main {

    public static void main(String[] args) {
        InMemoryCache<String, Integer> cache = new InMemoryCache<>();

        // Adding key-value pairs
        cache.put("key1", 10);
        cache.put("key2", 20);
        cache.put("key3", 30);

        // Getting values
        System.out.println("Value for key1: " + cache.get("key1"));
        System.out.println("Value for key2: " + cache.get("key2"));

        // Removing a key
        cache.remove("key3");

        // Checking if key exists
        System.out.println("Contains key 'key3': " + cache.containsKey("key3"));

        // Size of the cache
        System.out.println("Size of cache: " + cache.size());
    }
}
