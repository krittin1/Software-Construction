import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Struct;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
        TreeMap<String, Double> student = new TreeMap<>();
        if(args.length == 0){
            System.err.println("Please enter score file");
            return;
        }
        String filename = args[0];
        System.out.println("Filename: " + filename);


        try {
            FileReader fileReader = new FileReader("score1.csv");
            BufferedReader buffer = new BufferedReader(fileReader);


            String line = buffer.readLine();

            while (line != null) {

                System.out.println(line);
                line = buffer.readLine();

            }
        }
        catch (IOException e){
            System.err.println("Error reading from file");
        }
    }
}
