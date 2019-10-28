public class Athlete {
    private String name;
    private double score;

    public Athlete(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " " + score ;
    }
}