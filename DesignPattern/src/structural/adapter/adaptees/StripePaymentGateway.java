package structural.adapter.adaptees;

public class StripePaymentGateway {

    public void charge(double amount) {
        // Stripe-specific payment processing logic
        System.out.println("Charged $" + amount + " using Stripe.");
    }
}
