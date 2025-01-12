import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
		    //Scanner 타입 변수 선언 후 생성된 Scanner 변수에 대입
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        //읽은 문자열을 String 변수에 저장 -- 엔터 누르면 입력된 문자열 읽음
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        //읽은 문자열을 String 변수에 저장
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " +result);
        System.out.println();

        while(true){
            System.out.print("입력 문자열: ");
            //읽은 문자열을 String 변수에 저장
            String data = scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}