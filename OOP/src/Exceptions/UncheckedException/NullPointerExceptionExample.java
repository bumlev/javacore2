package Exceptions.UncheckedException;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        String str = null;
        try {
            // Attempt to get the length of a null string
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println("NullPointerException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
