package week_2.Order;

public class Order {
    int orderId;
    String orderDate;
    void printOderInfo(){
        System.out.println("주문 ID: " + orderId);
        System.out.println("주문 날짜: " + orderDate);
    }

    public Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}
