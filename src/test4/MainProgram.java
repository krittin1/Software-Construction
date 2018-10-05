package test4;
import java.util.Scanner;
public class MainProgram {
    public static void main( String[] args){
        MasterMind player1 = new MasterMind();
        MasterMind player2 = new MasterMind();
        Scanner sc = new Scanner(System.in);
        String p1,p2;
        p1 = sc.next();
        p2 = sc.next();
        player1.setTarget(p1);
        player2.setNumber(p2);
        System.out.println(player2.calculate(player1,player2));
    }

}



