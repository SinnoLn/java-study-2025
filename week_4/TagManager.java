package week_4;

import java.util.HashSet;
import java.util.Scanner;

public class TagManager {
    public static void main(String[] args) {
        HashSet<String> tags = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 태그 추가 | 2. 모든 태그 보기 | 3. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            switch (choice) {
                case 1:
                    System.out.print("추가할 태그: ");
                    String tag = scanner.nextLine();
                    if (tags.add(tag)) {
                        System.out.println("태그 추가됨.");
                    } else {
                        System.out.println("이미 존재하는 태그입니다.");
                    }
                    break;
                case 2:
                    System.out.println("현재 태그 목록: " + tags);
                    break;
                case 3:
                    System.out.println("프로그램 종료.");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }
}