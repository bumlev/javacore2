package generic.genericMethod;

public class Main {

    public static void main(String[] args) {
        // Example usage
        int number = 10;
        String text = "Hello";

        // Validating number
        boolean isNumberValid = DataValidator.validateData(number, new PositiveNumberValidation());
        System.out.println("Is number valid? " + isNumberValid);

        // Validating string
        boolean isStringValid = DataValidator.validateData(text, new NonEmptyStringValidation());
        System.out.println("Is string valid? " + isStringValid);
    }
}
