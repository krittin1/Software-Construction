package test3;
import java.util.Scanner;
public class MainProgram {
    public static void main ( String[] args){
        int p,t,n,i=0;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt(); // first input
        n = sc.nextInt(); // second input

        while (i < n){
            p = sc.nextInt();
            Game num = new Game(p,t);
            num.checkTarget(p);
            i++;
        }

        //p = sc.nextInt();

        //Game num = new Game(p,t);
       // System.out.println(num.checkTarget(45));
        //num.checkTarget(p);
    }

}
