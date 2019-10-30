public class Frame {

    private double round1;
    private double round2;

    public Frame(double round1, double round2) {
        this.round1 = round1;
        this.round2 = round2;
    }

    public double getRound1() {
        return round1;
    }

    public double getRound2() {
        return round2;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "round1=" + round1 +
                ", round2=" + round2 +
                '}';
    }
}
