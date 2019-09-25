package hw2;

public class MainProgram {

    public static void main(String[] args) {



    Product[] products = {new Product(), new Product(),
            new Product()};


        double productMax = StatUtil.max(products, new Measurer<Product>() {
            @Override
            public double measure(Product obj) {
                return obj.getPrice();
            }
        });
        System.out.println("Product Price Max: " + productMax);

        Car[] cars = {new Car(), new Car(),
                new Car()};
        double carsMax = StatUtil.max(cars, new Measurer<Car>() {
                    @Override
                    public double measure(Car obj) {
                        return obj.getKiloDriven();
                    }
                });
        System.out.println("Car kiloDriven Max: " + carsMax);


    }



}
