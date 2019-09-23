//  Interface CallBack

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Fish");
        s1.addScore(10);
        Student s2 = new Student("Non");
        s2.addScore(100);
        Student s3 = new Student("Poom");
        s3.addScore(50.2);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        //Collections.sort(students);
        System.out.println(students);
        System.out.println("----------------------------------------------");
        Comparator<Student> scoreComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ( o1.getScore() > o2.getScore() ) return 1;
                if ( o1.getScore() < o2.getScore() ) return -1;
                return 0;
            }
        };




        Collections.sort(students, scoreComparator);

        System.out.println(students);
        System.out.println("----------------------------------------------------");

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return - o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(students, nameComparator);

        System.out.println(students);

        System.out.println("----------------------------------------------------------");
        // anonymous class
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());   // call back
            }
        });

    }
}
