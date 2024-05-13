package structural.adapter.adapters;

import structural.adapter.adaptees.PayPal;
import structural.adapter.interfaces.PaymentGateway;

public class PayPalAdapter implements PaymentGateway {

    private final PayPal paymentGateway;

    public PayPalAdapter(PayPal paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment (double amount) {
        //Convert our application's method to PayPal's method
        paymentGateway.makePayment(amount);
    }
}
