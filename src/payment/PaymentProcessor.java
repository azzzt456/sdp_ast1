package payment;

public class PaymentProcessor {
    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
    }
}

