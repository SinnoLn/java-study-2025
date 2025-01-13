package week_2_2;

// 자식객체가 생성될 때 부모객체가 먼저 생성되고 자식객체가 생성된다.
// 자식객체가 생성될 때 부모객체의 생성자를 호출한다.
// 클래스에 명시적인 생성자가 하나도 없다면 자바 컴파일러가 기본 생성자를 추가한다.
public class Phone {
    public String model;
    public String color;

    public Phone() {
        System.out.println("Phone 생성자 호출됨");
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("매개 변수를 가지는 Phone 생성자 호출됨");
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
