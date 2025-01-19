package week_1;

public class SwitchExample2 {
    public static void main(String[] args){
        char grade1 = 'B';
        char grade2 = 'A';

        switch (grade1){
            case 'A':
            case 'a':
                System.out.println("우수 회원이에요!");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원이에요!");
                break;
            default:
                System.out.println("손님이에요!");
        }

        //Java 버전 12 이후부터 Expression 식으로 표현 가능
        switch (grade2){
            case 'A', 'a' -> System.out.println("우수 회원이에요!");
            case 'B', 'b' -> System.out.println("일반 회원이에요!");
            default -> System.out.println("손님이에요!");
        }
    }
}
