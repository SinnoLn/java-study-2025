package week_2_2.practice.order;

class Order {
    int orderId; // 주문 ID
    String orderDate; // 주문 날짜

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // 주문 정보 출력
    void printOrderInfo() {
        System.out.println("주문 ID: " + orderId);
        System.out.println("주문 날짜: " + orderDate);
    }
}
