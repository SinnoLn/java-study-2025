package week_2_2;

public class CarrExample {
    public static void main(String args[]){
        Carr myCar = new Carr();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();
    }
}
