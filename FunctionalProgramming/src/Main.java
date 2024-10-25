import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void   Lambda(List<String> list){


        /**
         * Before java 8
         */
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                System.out.println(list);
                return s1.compareTo(s2);
            }
        });


        /**
         * With Java 8 Lambda Expression
         */
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
    }


    public static void main(String[] args){

        /**
         * The difference between Lambda Expressions and Anonymous Inner Classes
         */

        /**
         *  The Anonymous Inner Classes
         */

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running in a new thread");
                }
            }).start();

        /**
         *  The Lambda Expressions
         */
            new Thread(() -> System.out.println("Running in a new thread")).start();



        List<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        Main.Lambda(fruits);
    }
}
