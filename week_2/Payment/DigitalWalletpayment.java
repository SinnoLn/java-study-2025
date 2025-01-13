package week_2.Payment;

public class DigitalWalletpayment implements Payment {
    @Override
    public void processPayment(int amount){
        System.out.println("디지털 지갑으로 " + amount + "원을 결재합니다.");
    };
    @Override
    public void printRecipt(){
        System.out.println("디지털 지갑 영수증을 출력합니다.");
    };
}
