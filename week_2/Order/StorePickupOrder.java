package week_2.Order;

public class StorePickupOrder extends Order{
    String storeLocation;
    @Override
    void printOderInfo(){
        super.printOderInfo();
        System.out.println("매장 위치: " + storeLocation);
    }

    public StorePickupOrder(int orderId, String orderDate, String storeLocation){
        super(orderId, orderDate);
        this.storeLocation = storeLocation;
    }
}
