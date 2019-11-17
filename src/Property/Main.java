package test4;

//elab-source: Main.java
//elab-mainclass: Main
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CalculateArea> item= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0;i < size;i++){
            String type = sc.next();
            if(type.equals("House")){
                item.add(new House(sc.nextInt()));
            }
            else if(type.equals("Pond")){
                item.add(new Pond(sc.nextInt()));
            }
            else if(type.equals("Building")){
                item.add(new Building(sc.nextInt(),sc.nextInt(),sc.nextInt()));
            }
        }

        Calculation calculation = new Calculation();
        System.out.println(String.format("%.2f",calculation.getArea(item)));

    }
}


