package hw2;

public class MaxPriceMeasurer implements Measurer<Product> {

    @Override
    public double measure(Product obj) {
        return obj.getPrice();
    }


}
