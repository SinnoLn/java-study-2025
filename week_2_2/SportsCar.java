package week_2_2;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // final 키워드를 사용하여 메소드를 재정의할 수 없도록 함
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춥니다.");
//        speed = 0;
//    }
}
