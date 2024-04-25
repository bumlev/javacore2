package Exceptions.CustomException;

public class Main {

    public static void main(String[] args) {
        int age = 16;
        try {
            CustomExceptionExample.validateAge(age);
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("CustomException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
