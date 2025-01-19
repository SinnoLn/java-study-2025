package week_2.Ex;

public class OnlineOrder extends Order {

    private String deliveryAddress;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("배송 주소: " + deliveryAddress);
    }

}
