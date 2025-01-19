package week_2_2.practice.order;

class StorePickupOrder extends Order {
    String storeLocation; // 매장 위치

    public StorePickupOrder(int orderId, String orderDate, String storeLocation) {
        super(orderId, orderDate); // 부모 클래스의 생성자 호출
        this.storeLocation = storeLocation;
    }

    @Override
    void printOrderInfo() {
        super.printOrderInfo(); // 부모 클래스의 메소드 호출
        System.out.println("매장 위치: " + storeLocation);
    }
}