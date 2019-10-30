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


    public void addAthlete(String name,List<Frame> frame ){
        athletes.add(new Athlete(name, frame));
    }



    public List<Athlete> calculate(){
        List<Athlete> athletePass = this.athletes;
        double total = 0;
        for (Athlete i : athletePass) {

           i.setScore(calculator.calculate(i.getFrame()));
        }

        return athletePass;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }
}