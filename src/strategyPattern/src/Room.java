import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Student> students;
    private GradeCalculator calculator;

    public void setCalculator(GradeCalculator calculator) {
        this.calculator = calculator;
    }

    public Room(){
        students = new ArrayList<>();
     }


     public void addStudent(String id, double score){
        students.add(new Student(id,score));
     }

     public List<Student> calculateGrade(){
         List studentPass = new ArrayList();
         for (Student i : students) {
            if (i.getScore() >= calculator.calculateGrade(i)){
                studentPass.add(i);
            }
         }

        return studentPass;
     }

     public List<Student> getStudents() {
        return students;
     }
}
