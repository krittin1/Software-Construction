package test4;

//elab-source: Pond.java
public class Pond implements CalculateArea {
    private int radius;

    public Pond(int radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
