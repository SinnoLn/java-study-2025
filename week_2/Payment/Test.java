package week_2.Payment;

public class Test {
    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        DigitalWalletpayment digitalWalletpayment = new DigitalWalletpayment();

        cashPayment.processPayment(5000);
        cashPayment.printRecipt();
        digitalWalletpayment.processPayment(15000);
        digitalWalletpayment.printRecipt();
    }
}
