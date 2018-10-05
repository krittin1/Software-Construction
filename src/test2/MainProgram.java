package test2;
import java.util.Scanner;
public class MainProgram {
        public static void main(String[] args) {
            double money;
            int n,i=0;
            double total=0;
        Scanner sc = new Scanner(System.in);

        //money = sc.nextDouble();
        n = sc.nextInt();

        while (i < n ){
            money = sc.nextDouble();
            Customer a = new Customer(money);
            i++;
            total = total+(double)a.calculateStamps(money);


        }
            System.out.println((int)total);
        //Customer a = new Customer(money);

        //Customer function = new Customer();
        //System.out.println((int)a.calculateStamps(money));
        //System.out.println(function.calculat)eStamps);
         //6+9+10.3998+1.99
    }

}



