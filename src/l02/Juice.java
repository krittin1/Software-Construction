package l02;

public class Juice extends Drinks {
    private int juiceType;
    private int juicePrice;

    public Juice(int size, int cold_frappe, int quantity, int juiceType) {
        super(size, cold_frappe, quantity);
        this.juiceType = juiceType;
    }

    // calculate from juice type
    public int calculateJuicePrice() {
        juicePrice = juicePrice + calculatePrice();
        if (juiceType == 1 || juiceType == 2 || juiceType == 3 || juiceType == 4 || juiceType == 5) {
            juicePrice = juicePrice + 100;
            //   orange juice, grape juice, apple juice, melon juice, mango juice 100 ฿
        }
        return juicePrice = juicePrice * getQuantity();
    }

    @Override
    public String toString() {
        return "Juice price is " + calculateJuicePrice() + " Baht.";
    }

    public void setJuicePrice(int juicePrice) {
        this.juicePrice = juicePrice;
    }

    public int getJuiceType() {
        return juiceType;
    }
}
