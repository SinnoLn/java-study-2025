package week_2_2.practice.order;

class OnlineOrder extends Order {
    String deliveryAddress; // 배송 주소

    public OnlineOrder(int orderId, String orderDate, String deliveryAddress) {
        super(orderId, orderDate); // 부모 클래스의 생성자 호출
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    void printOrderInfo() {
        super.printOrderInfo(); // 부모 클래스의 메소드 호출
        System.out.println("배송 주소: " + deliveryAddress);
    }
}
