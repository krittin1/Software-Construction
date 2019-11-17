package test4;

//elab-source: Calculation.java
import java.util.ArrayList;

public class Calculation {
    public double getArea(ArrayList<CalculateArea> e){
        double area = 0;
        for (CalculateArea x: e) {
            area += x.getArea();
        }
        return area;
    }
}