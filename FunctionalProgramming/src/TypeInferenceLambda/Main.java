package TypeInferenceLambda;

import java.util.Comparator;

public class Main {


    public static void main(String[] args){

        /**
         * For example, when using a lambda expression with the Comparator interface
         * , the type of the parameters can be omitted as the compiler can infer them:
         */

        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

        int n = comparator.compare("levy" , "Bumwe");
        System.out.println("the number is: " + n);
    }
}
