package week_1;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);


        if(num > 90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A 입니다");
        }
        else if(num < 90 && num > 70){
            System.out.println("점수가 70보다 크고 90보다 작습니다.");
            System.out.println("등급은 B 입니다");
        }
        else {
            System.out.println("당신은 F 입니다");
        }
    }
}
