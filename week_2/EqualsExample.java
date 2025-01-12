package week_2;

public class EqualsExample {
    public static void main(String[] args){
        String StrVar1 = "홍길동";
        String StrVar2 = "홍길동";

        if(StrVar1 == StrVar2){
            System.out.println("StrVar1와 StrVar2는 참조가 같음");
        } else {
            System.out.println("StrVar1와 StrVar2는 참조가 다름");
        }

        if(StrVar1.equals(StrVar2)){
            System.out.println("StrVar1와 StrVar2는 문자열이 같음");
        }

        String StrVar3 = new String("홍길동");
        String StrVar4 = new String("홍길동");

        if(StrVar3 == StrVar4){
            System.out.println("StrVar3와 StrVar4는 참조가 같음");
        } else {
            System.out.println("StrVar3와 StrVar4는 참조가 다름");
        }

        if(StrVar3.equals(StrVar4)){
            System.out.println("StrVar3와 StrVar4는 문자열이 같음");
        }
    }
}
