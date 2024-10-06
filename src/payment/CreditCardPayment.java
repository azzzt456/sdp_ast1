package payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка платежа кредитной картой на сумму $" + amount);
    }
}
