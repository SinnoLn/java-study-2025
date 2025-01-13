package week_2_2;

public class SmartPhone extends Phone {
    public boolean wifi;

    //만약 부모클래스에 기본 생성자가 없다면 super()를 사용하여 부모클래스의 생성자를 호출해야 한다.
    //매개변수가 없을 경우 super()는 자동으로 호출된다.
    public SmartPhone(String model, String color){
        super(model, color); // 매개변수를 가지는 Phone 생성자 호출을 위해서 반드시 명시
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone 생성자 호출됨");
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("Wi-Fi 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷을 사용합니다.");
    }
}
