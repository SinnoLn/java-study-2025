package week_4;

import java.util.*;
import java.util.stream.Collectors;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}

public class UserManagement {
    public static void main(String[] args) {
        // 사용자 목록 초기화
        List<User> users = Arrays.asList(
                new User("Alice", "alice@gmail.com"),
                new User("Bob", "bob@yahoo.com"),
                new User("Charlie", "charlie@gmail.com"),
                new User("David", "david@company.com"),
                new User("Eve", "eve@gmail.com")
        );

        // 1. 특정 조건으로 사용자 필터링 (Gmail 사용자만)
        List<User> gmailUsers = users.stream()
                .filter(user -> user.getEmail().endsWith("@gmail.com"))
                .collect(Collectors.toList());
        System.out.println("Gmail 사용자: " + gmailUsers);

        // 2. 사용자 이름을 대문자로 변환
        List<String> upperCaseNames = users.stream()
                .map(user -> user.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("대문자 이름 목록: " + upperCaseNames);

        // 3. 이름으로 정렬
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        System.out.println("정렬된 사용자 목록: " + sortedUsers);

        // 4. 사용자 통계 (총 사용자 수)
        long userCount = users.stream().count();
        System.out.println("총 사용자 수: " + userCount);
    }
}
