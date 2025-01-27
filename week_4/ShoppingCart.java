package week_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 아이템 추가 | 2. 아이템 삭제 | 3. 장바구니 보기 | 4. 종료");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            switch (choice) {
                case 1:
                    System.out.print("추가할 아이템: ");
                    String item = scanner.nextLine();
                    cart.add(item);
                    System.out.println(item + " 추가됨.");
                    break;
                case 2:
                    System.out.print("삭제할 아이템: ");
                    item = scanner.nextLine();
                    if (cart.remove(item)) {
                        System.out.println(item + " 삭제됨.");
                    } else {
                        System.out.println(item + " 없음.");
                    }
                    break;
                case 3:
                    System.out.println("장바구니: " + cart);
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