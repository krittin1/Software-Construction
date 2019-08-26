public class MainFoodCenterCard {

    public static void main(String[] args) {

      GreenCard green = new GreenCard();
      BlueCard blue = new BlueCard();
      FoodCenterCard grey = new FoodCenterCard();

        grey.topUp(100);
        System.out.println(grey.getBalance());
        grey.spend(100);
        System.out.println(grey.getBalance());

        System.out.println("-----------------------------------");
        green.topUp(200);
        System.out.println(green.getBalance());
        green.spend(20);
        System.out.println(green.getBalance());


        System.out.println("-----------------------------------");

        blue.topUp(200);

        System.out.println(blue.getBalance(), blue.getPoint());

        blue.spend(50);
        System.out.println(blue.getBalance(), blue.getPoint());

    }
}
