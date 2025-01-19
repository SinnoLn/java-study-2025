package week_2.Ex;

public class Order {
    private int orderId;
    private String orderDate;

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void printOrderInfo() {
        System.out.println("주문 번호: + orderId");
        System.out.println("주문 날짜: + orderDate");

    }
}
