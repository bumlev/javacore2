package commonFunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    // Consider a method that accepts a Predicate<String>
    public static List<String> filterStrings(List<String> list, Predicate<String> predicate) {
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


    public static void main(String[] args){

        Predicate<String> nonEmptyStringPredicate;
        nonEmptyStringPredicate = s -> !s.isEmpty();

        boolean truth = nonEmptyStringPredicate.test("hello");
        System.out.println("The truth is: " + truth);

        List<String> strings = new ArrayList<>();
        strings.add("levy");
        strings.add("fabrice");
        strings.add("kevin");

        // Consider a method that accepts a Predicate<String>
        System.out.println( Main.filterStrings(strings , nonEmptyStringPredicate));
    }
}
