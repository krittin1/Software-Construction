package test4;

//elab-source: House.java
public class House implements CalculateArea {
    int size;
    @Override
    public double getArea() {
        return size*4;
    }

    public House(int size){
        this.size = size;
    }
}