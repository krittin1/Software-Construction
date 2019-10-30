import java.util.List;

public class Strike implements Calculator {
    @Override
    public double calculate(List<Frame> frame) {
        double count=0;
        for ( Frame i : frame){
            if(i.getRound1() == 10){
                count++;
            }
        }
        return count;
    }
}
