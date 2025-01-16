public class Order {
    int orderID;
    String orderDate;

    public Order(int orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    void printOrderInfo() {
        System.out.println("주문 ID: " + orderID);
        System.out.println("주문 날짜: " + orderDate);
    }
}