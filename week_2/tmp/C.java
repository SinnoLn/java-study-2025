package week_2.tmp;

import week_2.A;

public class C {
    A a1 = new A(true);
//    A a2 = new A(1);
//    A a3 = new A("문자열");

    A a = new A();

    public C() {
        a.field1 = 1;
//        a.field2 = 1;
        // a.field3 = 1; // private field
        a.method1();
//        a.method2();
        // a.method3(); // private method
    }


}
