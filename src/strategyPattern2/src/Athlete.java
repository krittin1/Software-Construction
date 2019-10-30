import java.util.ArrayList;
import java.util.List;

public class Athlete {
    private String name;
    private double score;
    private List<Frame> frame;


    public Athlete(String name, List<Frame> frame) {
        this.name = name;
        this.score = score;
        this.frame = frame;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public List<Frame> getFrame() {
        return frame;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + (int)score ;
    }
}