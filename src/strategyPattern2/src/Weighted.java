public class Weighted implements Calculator {

    private double weight1, weight2, weight3;
    public Weighted(double game1, double game2, double game3 ){
        this.weight1 = game1;
        this.weight2 = game2;
        this.weight3 = game3;

    }

    @Override
    public double calculate(Athlete athlete) {
        return 0;
    }
}
