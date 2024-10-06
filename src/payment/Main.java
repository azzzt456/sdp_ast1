package payment;

public class Main {
    public static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment();
        PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
        processor.executePayment(100);


        Payment payPalPayment = new PayPalPayment();
        processor = new PaymentProcessor(payPalPayment);
        processor.executePayment(200);


        Payment bankTransferPayment = new BankTransferPayment();
        processor = new PaymentProcessor(bankTransferPayment);
        processor.executePayment(300);
    }
}
