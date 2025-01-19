package week_2.Ex;

public class StorePickupOrder extends Order {
    private String storeLocation;

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("배송 주소: " + storeLocation);
    }
}
