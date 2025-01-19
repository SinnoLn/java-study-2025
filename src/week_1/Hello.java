package week_1;

public class Hello {
    public static void main(String[] args){
        int d = 10;
        String s = "jiny";

        System.out.print("행을 바꾸지 않습니다"); //괄호안의 내용 출력 후 행 바꾸기
        System.out.println("반갑습니다."); //괄호안의 내용 출력 후 행 안바꾸기
        System.out.printf("%d %s", d,s); //형식 문자열에 맞추어 뒤의 값 출력
        System.out.printf("%2$d %1$s", s,d); //순번 바꾸기도 가능
    }
}
