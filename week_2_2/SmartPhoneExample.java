package week_2_2;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("구글폰", "검정");

        System.out.println("모델명: " + myPhone.model);
        System.out.println("색깔: " + myPhone.color);

        System.out.println("Wi-Fi 연결: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("안녕하세요.");
        myPhone.receiveVoice("안녕하세요. 반갑습니다.");
        myPhone.sendVoice("아 네 반가워요");
        myPhone.hangUp();

        myPhone.setWifi(true);
        System.out.println("Wi-Fi 연결: " + myPhone.wifi);

        myPhone.internet();
    }
}
