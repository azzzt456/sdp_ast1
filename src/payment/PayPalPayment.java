package payment;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа через PayPal на сумму $" + amount);
    }
}
