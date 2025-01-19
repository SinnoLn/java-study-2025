package week_2_2.practice.payment;

public class PaymentExample {
    public static void main(String[] args) {
        // CashPayment 객체 생성 및 호출
        Payment cashPayment = new CashPayment();
        cashPayment.processPayment(5000);
        cashPayment.printReceipt();

        // DigitalWalletPayment 객체 생성 및 호출
        Payment digitalWalletPayment = new DigitalWalletPayment();
        digitalWalletPayment.processPayment(15000);
        digitalWalletPayment.printReceipt();
    }
}