package week_2_2;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    // final 키워드를 사용하여 메소드를 재정의할 수 없도록 함
    //자식에서 @Override 시 에러 발생
    public final void stop() {
        System.out.println("차를 멈춥니다.");
        speed = 0;
    }
}
