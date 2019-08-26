import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // how to split string
        // name 13
        String[] splitString = s.split("");
        System.out.println(Arrays.toString(splitString));

        for ( String c : splitString) {
            System.out.println(c);
        }
        String  s3 = 13 +"";  // convert int to string
        // type wrapper

        Cat c1 = new Cat(splitString[0], Integer.parseInt(splitString[1]));   // convert string to int




    }
}
