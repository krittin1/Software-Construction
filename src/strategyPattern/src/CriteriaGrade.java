

public class CriteriaGrade implements GradeCalculator {

    private double crit;
    public CriteriaGrade(double score){
        this.crit = score;
    }

    @Override
    public double calculateGrade(Student student) {
        return this.crit;
    }
}
