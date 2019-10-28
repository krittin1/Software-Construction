import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
        Committee room = new Committee();
        if (args.length == 0) {
            System.err.println("Please enter score file");
            return;
        }

        for(int i=0; i< args.length;i++) {
            String filename = args[i];
            System.out.println("Filename: " + filename);
            try {
                FileReader fileReader = new FileReader(args[i]);
                BufferedReader buffer = new BufferedReader(fileReader);
                String line = buffer.readLine();

                while (line != null) {
                String[] dataItems = line.split(",");
                String idFile = dataItems[0];
                double scoreFile = Double.parseDouble(dataItems[1]);
                    System.out.println(line);
                    line = buffer.readLine();
                room.addStudent(idFile, scoreFile);
                }

            } catch (IOException e) {
                System.err.println("Error reading from file");
            }

        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------KU Bowling Competition---------------");
            System.out.println("| <A> summation  <B> weighted    <C> strike    <E> exit  |");
            System.out.println("----------------------------------------------------------");
            String choice = sc.next();
            if (choice.equals("E")) {
                break;
            } else if (choice.equals("A") || choice.equals("B") || choice.equals("C")) {
                if (choice.equals("A")) {
                    System.out.println("[a] ascending score");
                    System.out.println("[d] descending score");
                    room.setCalculator(new Sum(room.getAthletes()));
                } else if (choice.equals("B")) {

                    System.out.print("Please enter criteria: ");
                    double criteria = sc.nextDouble();
                    System.out.println("[a] ascending score");
                    System.out.println("[d] descending score");
                    if (criteria > 0 && criteria <= 100) {
                        room.setCalculator(new Weighted(criteria));
                    }else {
                        room.setCalculator(new Weighted(0));
                        try {
                            throw new IllegalArgumentException("criteria must more than 0");
                        } catch (IllegalArgumentException e) {
                            System.err.println("Sorry try again!!");
                        }
                    }
                } else if (choice.equals("C")) {

                }

                String choice_sort = sc.next();
                List<Athlete> passAthletes = room.calculateGrade();
                // todo: select ascending or descending
                //System.out.println(passStudents);
                if (choice_sort.equals("a")){
                    passAthletes.sort(new Comparator<Athlete>() {
                        @Override
                        public int compare(Athlete o1, Athlete o2) {
                            return (int)o1.getScore()-(int)o2.getScore();
                        }
                    });
                    //System.out.println(passStudents);
                    System.out.println("student pass amount: "+passAthletes.size());
                    for (Athlete i : passAthletes) {
                        System.out.println(i.getName()+" "+i.getScore());
                    }
                } else if (choice_sort.equals("d")) {
                    passAthletes.sort(new Comparator<Athlete>() {
                        @Override
                        public int compare(Athlete o1, Athlete o2) {
                            return (int) o2.getScore() - (int) o1.getScore();
                        }
                    });
                    //System.out.println(passStudents);
                    System.out.println("student pass amount: "+passAthletes.size());
                    for (Athlete i : passAthletes) {
                        System.out.println(i.getName()+" "+i.getScore());
                    }
                }

            } else {
                try {
                    throw new InvalidInputException("input must be A or X or E only.");
                } catch (InvalidInputException e) {
                    System.err.println("Sorry try again!!");

                }
            }
        }
    }
}
