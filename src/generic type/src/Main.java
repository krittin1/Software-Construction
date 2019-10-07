import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(10);
        System.out.println(iBox.get());


        Box<String> strBox = new Box<>();
        strBox.set("Hello Generic Type");
        System.out.println(strBox.get());

        Box<Student> stuBox = new Box<>();
        stuBox.set(new Student("Atom"));
        stuBox.get().addScore(50);
        System.out.println(stuBox.get());


        System.out.println("---------------------------------------------------------------------");


        Pair<String, Double> rating;
        rating = new OrderedPair<>("Joker", 10.0);

        System.out.println(rating.getKey());
        System.out.println(rating.getValue());

        Pair<String, Student> studentPair;
        studentPair = new OrderedPair<>(
                "เกียรตินิยมอันดับ 8", new Student("Atom"));

        studentPair.getValue().addScore(88.88);
        System.out.println(studentPair.getKey());
        System.out.println(studentPair.getValue());

        Pair<String, Box<Student>> boxPair;
        boxPair = new OrderedPair<>(
                "Bob", new Box<>()
        );
        boxPair.getValue().set(new Student("Saharat"));
        boxPair.getValue().get().addScore(98);
        System.out.println(boxPair.getKey());
        System.out.println(boxPair.getValue().get().toString());


        System.out.println("-----------------------Raw Type----------------------------------------");


        Box rawBox = new Box();
        ArrayList rawList = new ArrayList();
        rawBox = iBox;
        rawBox.set(new Student("Bob"));                             // warning
        System.out.println(rawBox.get());
   //     rawBox.get().addScore(70);                                // error


        System.out.println("-----------------------Generic Methods--------------------------------");
        Student s1 = new Student("Cat");
        Student s2 = new Student("Bat");
        System.out.println(Util.equals(s1, s2));


        System.out.println(Util.<Student>equals(stuBox , boxPair.getValue()));
        System.out.println(Util.equals(stuBox, boxPair.getValue()));


        List<Student> students = new ArrayList<>();
        Student s3 = new Student("Ant");
        Student s4 = new Student("Dog");

        s1.addScore(88);
        s2.addScore(89);
        s3.addScore(90);
        s4.addScore(88.5);


        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);


        System.out.println(students);


        System.out.println(Data.max(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() > o2.getScore()) return 1;
                if (o1.getScore() < o2.getScore()) return -1;
                return 0;
            }
         }));



        System.out.println(Data.max(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getName().compareTo(o2.getName());
            }
        }));






    }
}
