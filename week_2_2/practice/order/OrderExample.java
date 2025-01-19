package week_2_2.practice.order;

public class OrderExample {
    public static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder(1, "2025-01-13", "서울특별시 강남구");
        onlineOrder.printOrderInfo();

        // 주문 ID: 1
        // 주문 날짜: 2025-01-13
        // 배송 주소: 서울특별시 강남구

        StorePickupOrder storePickupOrder = new StorePickupOrder(2, "2025-01-14", "강남점");
        storePickupOrder.printOrderInfo();

        // 주문 ID: 2
        // 주문 날짜: 2025-01-14
        // 매장 위치: 강남점
    }
}
