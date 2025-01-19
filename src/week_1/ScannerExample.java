package week_1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("숫자를 입력하세요: ");
            int number = scanner.nextInt();
            System.out.println("입력한 숫자: " + number);
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요!");
        } finally {
            scanner.close();
        }
    }
}
