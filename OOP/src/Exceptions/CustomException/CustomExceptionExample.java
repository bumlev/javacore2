package Exceptions.CustomException;

public class CustomExceptionExample {

    // Method that throws our custom exception
    public static void validateAge(int age)  {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
