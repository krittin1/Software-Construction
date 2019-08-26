public class BlueCard extends FoodCenterCard {


    private int point;
    private String color;

    public BlueCard() {
        super();
        point = 0;
        this.color = color;

    }


    @Override
    public void topUp(double money){
        super.topUp(money);

        point += ((int) (money / 200)) * 10;


    }

    @Override
    public void spend(double purchase)  {


            super.spend(purchase);
            point += ((int) (purchase / 50)) * 2;

    }

    public void usePoint(int point) throws IllegalAccessException {
        if (point > this.point)
            throw new IllegalArgumentException("point is insufficient");

        if (color.equals("Blue")) {
            this.point -= point;
        } else {
            throw new IllegalAccessException("invalid card type");
        }
    }



    public int getPoint() throws IllegalAccessException {
        if (!color.equals("Blue"))
            throw new IllegalAccessException("invalid card type");
        return point;
    }

}
