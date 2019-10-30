import java.util.List;

public class Sum implements Calculator {

    @Override
    public double calculate(List<Frame> frame) {
        double total = 0,temp;
        for ( Frame i : frame){
            temp = i.getRound1() + i.getRound2();
            total = total + temp;
        }
       return total;
    }
}