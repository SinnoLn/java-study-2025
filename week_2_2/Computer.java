package week_2_2;

public class Computer extends Calculator{
    // Calculator 클래스의 areaCircle() 메소드를 재정의
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
