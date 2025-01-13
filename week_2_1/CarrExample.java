package week_2_1;

public class CarrExample {
    public static void main(String[ ] args){
        Carr myCar = new Carr();

        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed() + " km/h");

        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed() + " km/h");

        if (!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println("현재 속도: " + myCar.getSpeed() + " km/h");

    }
}
