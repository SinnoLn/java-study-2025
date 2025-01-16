public class OnlineOrder extends Order {
    String deliveryAddress;

    public OnlineOrder(int orderID, String orderDate, String deliveryAddress) {
        super(orderID, orderDate);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("배송 주소: " + deliveryAddress);
    }
}