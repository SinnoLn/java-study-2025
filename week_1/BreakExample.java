package week_1;

public class BreakExample {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};
        char[] words = {'a','d','b','e','d'};

        // 배열 요소 접근
        System.out.println("첫 번째 값: " + numbers[0]); // 1
        System.out.println("세 번째 값: " + numbers[2]); // 3

        // 배열 수정
        numbers[2] = 10; // 세 번째 값 수정
        System.out.println("수정된 세 번째 값: " + numbers[2]); // 10

        // 배열 순회
        for (char c : words) {
            System.out.print(c + " "); // 1 2 10 4 5
        }

        for(int i=0; i<10; i++){
            
        }
    }
}
