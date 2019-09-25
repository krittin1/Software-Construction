package hw1;

public class Car implements Measurable{
    private String license;
    private double kiloDriven; // ระยะทางการขับ

    public String getLicense() {
        return license;
    }

    public double getKiloDriven() {
        return kiloDriven;
    }

    @Override
    public double getMeasure() {
        return kiloDriven;
    }

    public void setKiloDriven(double kiloDriven) {
        this.kiloDriven = kiloDriven;
    }
}