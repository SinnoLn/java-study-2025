package week_2_2.tmpPackage;

import week_2_2.A;

public class D extends A {
    public D() {
        //A 생성자 호출
        super();
    }

    public void method() {
        //A.field 접근
        this.field = "value";
        //A.method() 호출
        this.method();
    }

//    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
//    }
}
