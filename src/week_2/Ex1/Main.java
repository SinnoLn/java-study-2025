package week_2.Ex1;

public class Main {
    public static void main(String[] args) {
        Payment cashPayment = new CashPayment();
        cashPayment.processPayment(5000);
        cashPayment.printReceipt();

        Payment digitalPayment = new DigitalWalletPayment();
        digitalPayment.processPayment(15000);
        digitalPayment.printReceipt();
    }
}
