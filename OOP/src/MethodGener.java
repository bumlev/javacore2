public class MethodGener {


    // Generic method to find the maximum of any comparable objects
    public static <T extends  Comparable<T>> T findMax(T[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 2, 9, 5};
        System.out.println("Maximum Integer: " + findMax(intArray));

        String[] stringArray = {"apple", "banana", "orange", "grape"};
        System.out.println("Maximum String: " + findMax(stringArray));
    }
}
