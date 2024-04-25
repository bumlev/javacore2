package collectionsFramework.ConcurrentCollections;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCache<K , V> {

    private final ConcurrentHashMap<K, V> cache;

    public InMemoryCache() {
        this.cache = new ConcurrentHashMap<K, V>();
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.get(key);
    }

    public void remove(K key) {
        cache.remove(key);
    }

    public boolean containsKey(K key) {
        return cache.containsKey(key);
    }

    public int size() {
        return cache.size();
    }

}
