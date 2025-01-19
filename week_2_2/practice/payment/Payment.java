package week_2_2.practice.payment;

interface Payment {
    void processPayment(int amount); // 결제 처리 메소드
    void printReceipt(); // 영수증 출력 메소드
}
