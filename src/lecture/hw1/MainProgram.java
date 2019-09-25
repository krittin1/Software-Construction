package hw1;

public class MainProgram {

    public static void main(String[] args) {


        Product[] products = {new Product(), new Product(),
                new Product()};
        products[0].setPrice(1500);
        products[1].setPrice(20000);
        products[2].setPrice(30);

        double priceMax = StatUtil.max(products);
        System.out.println("Product Price Max: "+priceMax);



        Car[] cars = {new Car(), new Car(),
                new Car()};
        cars[0].setKiloDriven(55);
        cars[1].setKiloDriven(45);
        cars[2].setKiloDriven(32);

        double carMax = StatUtil.max(cars);
        System.out.println("Car kiloDriven Max: "+carMax);


    }
}
