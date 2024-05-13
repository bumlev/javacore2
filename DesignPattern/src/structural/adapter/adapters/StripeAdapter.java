package structural.adapter.adapters;

import structural.adapter.adaptees.StripePaymentGateway;
import structural.adapter.interfaces.PaymentGateway;

public class StripeAdapter implements PaymentGateway {
    private final StripePaymentGateway paymentGateway;

    public StripeAdapter(StripePaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Convert our application's method to Stripe's method
        paymentGateway.charge(amount);
    }
}
