import java.util.List;

public class Weighted implements Calculator {

    private double weight1, weight2, weight3;
    public Weighted(double game1, double game2, double game3 ){
        this.weight1 = game1;
        this.weight2 = game2;
        this.weight3 = game3;
    }

    @Override
    public double calculate(List<Frame> frame) {
        double total = 0,temp,count=1,sum1 = 0,sum2 = 0;
        for ( Frame i : frame){
            if (count == 11){
                sum1 = total;
                total = 0;
            }else if (count == 21) {
                sum2 = total;
                total = 0;
            }
            temp = i.getRound1() + i.getRound2();
            total = total + temp;
            count++;
        }
        return (sum1/100)*weight1 + (sum2/100)*weight2 + (total/100)*weight3;
    }
}