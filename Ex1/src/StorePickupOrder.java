public class StorePickupOrder extends Order {
    String storeLocation;

    public StorePickupOrder(int orderId, String orderDate, String storeLocation) {
        super(orderId, orderDate);
        this.storeLocation = storeLocation;
    }

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("매장 위치: " + storeLocation);
    }
}