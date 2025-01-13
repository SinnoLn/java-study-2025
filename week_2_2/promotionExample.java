package week_2_2;

class AA {

}
class BB extends AA {

}
class CC extends AA {

}
class DD extends BB {

}
class EE extends CC {

}

public class promotionExample {
    public static void main(String[] args) {
        BB b = new BB();
        CC c = new CC();
        DD d = new DD();
        EE e = new EE();

        AA a1 = b;
        AA a2 = c;
        AA a3 = d;
        AA a4 = e;

        BB b1 = d;
        CC c1 = e;

        // BB b3 = e; // 컴파일 에러
        // CC c2 = d; // 컴파일 에러
    }
}
