package structural.adapter;

import structural.adapter.adapters.PayPalAdapter;
import structural.adapter.adapters.StripeAdapter;
import structural.adapter.adaptees.PayPal;
import structural.adapter.adaptees.StripePaymentGateway;
import structural.adapter.interfaces.PaymentGateway;

public class Main {

    public static void main(String[] args) {

        PaymentGateway paypalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateway = new StripeAdapter(new StripePaymentGateway());

        double amount = 100.0;

        // Process payments using different payment gateways
        paypalGateway.processPayment(amount);
        stripeGateway.processPayment(amount);
    }
}
