package hw1;

public class Product implements Measurable{
    private String name;
    private double price; // ราคา

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getMeasure() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
