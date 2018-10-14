package l02;

public class Softdrinks extends Drinks {
    private int softdrinkType;
    private int softdrinkPrice;

    public Softdrinks(int size, int cold_frappe, int quantity, int softdrinkType) {
        super(size, cold_frappe, quantity);
        this.softdrinkType = softdrinkType;
    }
    // calculate from soft drink type
    public int calculateSoftdrinkPrice() {
        softdrinkPrice =  softdrinkPrice + calculatePrice();
        if ( softdrinkType == 1 || softdrinkType == 2 || softdrinkType == 3 ){  // pepsi, coke, est 80 ฿
            softdrinkPrice = softdrinkPrice + 80;
        }
        else if ( softdrinkType == 4 ) {
            softdrinkPrice = softdrinkPrice + 100;                              //   italian soda  100 ฿
        }
        else if ( softdrinkType == 5 ) {
            softdrinkPrice = softdrinkPrice + 150;                              //   green tea soda 150 ฿
        }
        return softdrinkPrice = softdrinkPrice * getQuantity();

    }

    @Override
    public String toString() {
        return "Soft drink price is " +calculateSoftdrinkPrice()+" Baht.";

    }

    public void setSoftdrinkPrice(int softdrinkPrice) {
        this.softdrinkPrice = softdrinkPrice;
    }

    public int getSoftdrinkType() {
        return softdrinkType;
    }
}

