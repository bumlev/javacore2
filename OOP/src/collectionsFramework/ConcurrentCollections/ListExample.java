package collectionsFramework.ConcurrentCollections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);
    }
}
