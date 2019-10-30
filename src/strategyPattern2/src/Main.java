import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Committee committee = new Committee();
        List<Frame> frames = new ArrayList();

        if (args.length == 0) {
            System.err.println("Please enter score file");
            return;
        }
        String name = "";
        for (int i = 0; i < args.length; i++) {
            name = "";
            frames = new ArrayList<>();
            String filename = args[i];
            System.out.println("Filename: " + filename);

            try {
                FileReader fileReader = new FileReader(args[i]);
                BufferedReader buffer = new BufferedReader(fileReader);
                String line = buffer.readLine();
                int count = 0;

                while (line != null) {
                    if (count == 0) {
                        String nameFile = line;
                        name += line;

                    } else if (line.contains(",")) {
                        String[] data = line.split(",");
                        double datafile1 = Double.parseDouble(data[0]);
                        double datafile2 = Double.parseDouble(data[1]);
                        frames.add(new Frame(datafile1, datafile2));
                    } else {
                        double datafile = Double.parseDouble(line);
                        frames.add(new Frame(datafile, 0.0));
                    }
                    System.out.println(line);
                    line = buffer.readLine();
                    count++;
                }
            } catch (IOException e) {
                System.err.println("Error reading from file");
            }
            committee.addAthlete(name, frames);
        }
        Scanner sc = new Scanner(System.in);
        List<Athlete> passAthletes;
        while (true) {
            System.out.println("---------------------KU Bowling Competition---------------");
            System.out.println("| <A> summation  <B> weighted    <C> strike    <E> exit  |");
            System.out.println("----------------------------------------------------------");
            String choice = sc.next();
            if (choice.equals("E")) {
                break;
            } else if (choice.equals("A") || choice.equals("B") || choice.equals("C")) {
                if (choice.equals("A")) {
                    committee.setCalculator(new Sum());
                } else if (choice.equals("B")) {
                    System.out.print("Please enter percent 1: ");
                    double percent1 = sc.nextDouble();
                    System.out.print("Please enter percent 2: ");
                    double percent2 = sc.nextDouble();
                    System.out.print("Please enter percent 3: ");
                    double percent3 = sc.nextDouble();
                    if (percent1 > 0 && percent2 > 0 && percent3 > 0) {
                        committee.setCalculator(new Weighted(percent1, percent2, percent3));
                    } else {
                        committee.setCalculator(new Weighted(1, 1, 1));
                        try {
                            throw new IllegalArgumentException("percent must more than 0");
                        } catch (IllegalArgumentException e) {
                            System.err.println("Sorry try again!!");
                        }
                    }
                } else if (choice.equals("C")) {
                    committee.setCalculator(new Strike());
                }
                        passAthletes = committee.calculate();
                        passAthletes.sort(new Comparator<Athlete>() {
                            @Override
                            public int compare(Athlete o1, Athlete o2) {
                                return (int) (o2.getScore() - o1.getScore());
                            }
                        });
                        for (Athlete i : passAthletes) {
                            System.out.println(i);
                        }
            } else{
                try {
                    throw new InvalidInputException("input must be A or B or C or E only.");
                } catch (InvalidInputException e) {
                    System.err.println("Sorry try again!!");
                }
            }
        }
    }}
