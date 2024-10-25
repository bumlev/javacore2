package commonFunctionalInterfaces.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Integer> stringLengthFunction = String::length;

        int number = stringLengthFunction.apply("Bumwe");
        System.out.println("The number is: " +number);


        /**
         *  Between Integers
         */

        BiFunction<Integer , Integer , Integer> integersOperation = (x , y) -> x * y;
        System.out.println("The result is: " + integersOperation.apply(4,5));
    }
}
