package week_2;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();
        System.out.println("제작회사: " + myCar.company);
        System.out.println();

        Car myCar2 = new Car("자가용");
        System.out.println("제작회사: " + myCar2.company);
        System.out.println("모델명: " + myCar2.model);
        System.out.println();

        Car myCar3 = new Car("자가용", "빨강");
        System.out.println("제작회사: " + myCar3.company);
        System.out.println("모델명: " + myCar3.model);
        System.out.println("색깔: " + myCar3.color);
        System.out.println();

        Car myCar4 = new Car("택시", "검정", 200);
        System.out.println("제작회사: " + myCar4.company);
        System.out.println("모델명: " + myCar4.model);
        System.out.println("색깔: " + myCar4.color);
        System.out.println("최고속도: " + myCar4.maxSpeed);
    }
}
