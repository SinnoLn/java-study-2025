package Chapter2;

import Chapter1.Cat; //이전에 만들었던 Cat 클래스 재사용가능

public class Cat2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("나미",5,"black");
        Cat cat2 = new Cat("냐옹이",6,"white");

        cat1.meow();
        System.out.println(cat2.getName());
    }
}
