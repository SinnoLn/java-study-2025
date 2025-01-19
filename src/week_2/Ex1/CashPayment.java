package week_2.Ex1;

public class CashPayment implements Payment {

    @Override
    public void processPayment(int amount) {
        System.out.println("현금으로 " + amount + "원을 결제합니다.");
    }

    @Override
    public void printReceipt() {
        System.out.println("현금 영수증을 출력합니다");
    }
}
