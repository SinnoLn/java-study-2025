package Chapter1;

public class Cat {

    String name;
    int age;
    String color;

    //생성자(객체를 생성할 때 호출돠는 메서드)
    public Cat(String name, int age, String color) {
        this.name = name; //name을 현재 객체의 this.name필드에 할당한다는 뜻
        this.age = age;
        this.color = color;
    }
    //메서드
    public void meow() {
        System.out.println("냐옹");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("나비",3,"흰색");
        myCat.setName("톰");
        myCat.setAge(5);
        myCat.setColor("검은색");

        System.out.println("이름: " + myCat.getName());
        System.out.println("나이: " + myCat.getAge());
        System.out.println("색깔: " + myCat.getColor());
        myCat.meow();

    }
}
