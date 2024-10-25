package collectionsFramework.ConcurrentCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> studentGrades = new HashMap<>();
        studentGrades.put(92, "Alice");
        studentGrades.put(78, "Bob");
        //studentGrades.put("Charlie", 88);
        System.out.println("Student Grades: " + studentGrades);
    }
}
