import java.util.ArrayList;
import java.util.List;

public class Committee {
    private List<Athlete> athletes;
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Committee(){
        athletes = new ArrayList<>();
    }


    public void addAthlete(String name, double score){
        athletes.add(new Athlete(name,score));
    }

    public List<Athlete> calculate(){
        List athletePass = new ArrayList();
        for (Athlete i : athletes) {
            if (i.getScore() >= calculator.calculate(i)){
                athletePass.add(i);
            }
        }

        return athletePass;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }
}