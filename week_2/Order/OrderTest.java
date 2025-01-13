package week_2.Order;

public class OrderTest {
    public static void main(String[] args) {
        StorePickupOrder storePickupOrder = new StorePickupOrder(1,"2025-01-13","서울특별시 강남구");
        OnlineOrder onlineOrder = new OnlineOrder(2,"2024-04-12","충청북도 청주시");

        storePickupOrder.printOderInfo();
        onlineOrder.printOderInfo();
    }
}


