package week_2.Order;

public class OnlineOrder extends Order {
    String deliveryAddress;
    @Override
    void printOderInfo(){
        super.printOderInfo();
        System.out.println("배송 주소: " + deliveryAddress);
    }

    public OnlineOrder(int orderId, String orderDate, String deliveryAddress){
        super(orderId, orderDate);
        this.deliveryAddress = deliveryAddress;
    }
}
