package week_4;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String productName;
    private int quantity;
    private double price;

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}

public class OrderProcessing {
    public static void main(String[] args) {
        // 주문 데이터 초기화
        List<Order> orders = Arrays.asList(
                new Order("Laptop", 2, 1200.50),
                new Order("Mouse", 5, 25.99),
                new Order("Keyboard", 3, 45.50),
                new Order("Monitor", 1, 300.99),
                new Order("Headset", 4, 79.99)
        );

        // 1. 특정 조건으로 주문 필터링 (1000달러 이상의 주문)
        List<Order> expensiveOrders = orders.stream()
                .filter(order -> order.getTotalPrice() > 1000)
                .collect(Collectors.toList());
        System.out.println("1000달러 이상의 주문:");
        expensiveOrders.forEach(System.out::println);

        // 2. 주문 데이터 변환 (상품명 + 총 가격 출력)
        List<String> orderSummaries = orders.stream()
                .map(order -> order.getProductName() + " - $" + order.getTotalPrice())
                .collect(Collectors.toList());
        System.out.println("\n주문 요약:");
        orderSummaries.forEach(System.out::println);

        // 3. 주문 정렬 (총 가격 기준 내림차순)
        List<Order> sortedOrders = orders.stream()
                .sorted(Comparator.comparingDouble(Order::getTotalPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("\n총 가격 기준 내림차순 정렬:");
        sortedOrders.forEach(System.out::println);

        // 4. 총 주문 금액 계산
        double totalRevenue = orders.stream()
                .mapToDouble(Order::getTotalPrice)
                .sum();
        System.out.println("\n총 주문 금액: $" + totalRevenue);

        // 5. 병렬 처리 (각 주문의 총 가격 계산 및 출력)
        System.out.println("\n병렬 처리된 주문 총 가격:");
        orders.parallelStream()
                .map(order -> order.getProductName() + ": $" + order.getTotalPrice())
                .forEach(System.out::println);
    }
}