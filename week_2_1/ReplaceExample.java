package week_2_1;

public class ReplaceExample {
    public static void main(String[] args){
        String oldStr = "자바 문자열은 불변 입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바","Java");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
