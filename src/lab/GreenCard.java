public class GreenCard extends FoodCenterCard {


    public GreenCard() {
        super();
    }


    @Override
    public void topUp(double money){
       super.topUp(money);
        if (money >= 200) {
            super.topUp((int) (money / 200) * 10);
        }


    }
}
