package test1;
import java.util.Scanner;
public class MainProgram {
    public static void main (String[] args){
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(c,d);
        Fractional fractional = new Fractional ();
        //System.out.println(f1);
        //System.out.println(f2);
        System.out.println(fractional.add(f1,f2));
    }
}







