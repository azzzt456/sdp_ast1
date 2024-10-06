package payment;

public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработка банковского перевода на сумму $" + amount);
    }
}

