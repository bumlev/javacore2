package commonFunctionalInterfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<LocalDateTime> currentTimeSupplier = LocalDateTime::now;
        System.out.println("The date is: " + currentTimeSupplier.get());
    }
}
