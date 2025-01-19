package Chapter1;


public class Lion extends Cat {
    public Lion(String name, int age, String color) {
        super(name,age,color);
    }

    public void roar() {
       // System.out.println("어흥!");
        super.meow(); //냐옹
        //super는 부모 클래스에 정의된 메서드를 직접 호출
    }

    public void meow() {
        System.out.println("나는 사자다! 어흥!");
    }

    public static void main(String[] args) {
        Lion lion = new Lion("삼바",5,"갈색");
        lion.meow();
        lion.roar();
    }

}
