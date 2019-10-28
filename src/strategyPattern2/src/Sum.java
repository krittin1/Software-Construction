import java.util.List;

public class Sum implements Calculator {

    private List<Athlete> sumAthlete;
    public Sum(List<Athlete> athleteScore){
        sumAthlete = athleteScore;
    }

    @Override
    public double calculate(Athlete athlete) {
        double total = 0;
        for (Athlete i : sumAthlete) {
            total = total + i.getScore();
        }
        return total;
    }


}