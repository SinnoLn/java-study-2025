package week_4;

import java.util.HashMap;
import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 사용자 추가 | 2. 사용자 검색 | 3. 모든 사용자 보기 | 4. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            switch (choice) {
                case 1:
                    System.out.print("사용자 ID: ");
                    String id = scanner.nextLine();
                    System.out.print("사용자 이름: ");
                    String name = scanner.nextLine();
                    userMap.put(id, name);
                    System.out.println("사용자 추가됨.");
                    break;
                case 2:
                    System.out.print("검색할 사용자 ID: ");
                    id = scanner.nextLine();
                    System.out.println("사용자 이름: " + userMap.getOrDefault(id, "없음"));
                    break;
                case 3:
                    System.out.println("사용자 목록: " + userMap);
                    break;
                case 4:
                    System.out.println("프로그램 종료.");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }
}