package test4;

//elab-source: Building.java
public class Building implements CalculateArea {
    private int width,height,floor;

    public Building(int width, int height, int floor) {
        this.width = width;
        this.height = height;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return width*height*floor;
    }
}