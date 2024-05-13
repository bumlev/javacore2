package structural.adapter.adaptees;

public class PayPal {

    public void makePayment(double amount) {
        // PayPal-specific payment processing logic
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}
