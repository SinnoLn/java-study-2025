package week_2_2.practice.payment;

class DigitalWalletPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("디지털 지갑으로 " + amount + "원을 결제합니다.");
    }

    @Override
    public void printReceipt() {
        System.out.println("디지털 지갑 영수증을 출력합니다.");
    }
}
