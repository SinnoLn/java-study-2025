package week_1;

public class SwitchExample1 {
    public static void main(String[] args){
        int num = (int)(Math.random()*6) + 1;

        switch (num){
            case 1:
                System.out.println("1번이 나왔네요");
                break;
            case 2:
                System.out.println("2번이 나왔네요");
                break;
            case 3:
                System.out.println("3번이 나왔네요");
                break;
            case 4:
                System.out.println("4번이 나왔네요");
                break;
            case 5:
                System.out.println("5번이 나왔네요");
                break;
            default:
                System.out.println("6번이 나왔네요");
        }
    }
}
