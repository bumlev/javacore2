package understandSyntaxLambdaExpression;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        // Using a lambda expression to implement the 'add' method of the Calculator interface
        Calculator calculator = (a, b) -> a + b;

        // Calling the method using the lambda expression
        int result = calculator.add(10, 20);

        // Output the result
        System.out.println("The result is: " + result);



        /*  ----------------------------------    With a class StringProcessor --------------------------------------*/

        // Lambda expression with multiple lines of code
        StringProcessor processor = (str) -> {
            // Step 1: Trim the input string
            String resul = str.trim();

            // Step 2: Convert the string to uppercase
            resul = resul.toUpperCase();

            // Step 3: Append a suffix to the string
            resul = resul + "_PROCESSED";

            // Return the final result
            return resul;
        };

        // Calling the lambda expression
        String input = "   hello lambda   ";
        String output = processor.process(input);

        // Output the result
        System.out.println(output);
    }
}
