import java.util.ArrayList;
import java.util.List;

public class AverageGrade implements GradeCalculator {

    private List<Student> avgStudent;
    public AverageGrade(List<Student> studentsScore){
       avgStudent = studentsScore;
    }

    @Override
    public double calculateGrade(Student student) {
        double count = 0;
        for (Student i : avgStudent) {
            count = count + i.getScore();
        }
        return count/avgStudent.size();
    }


}
