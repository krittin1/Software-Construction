package test;

public class Student extends Person {
    private String id ;
    private double score;

    public Student(String name, String id) {
        super(name);
        this.id = id;
    }

    public double getScore(){
        return score;
    }

    public void addScore( double score ) {
        if(score < 0)
            throw new IllegalArgumentException("คะแนนต้องมากกว่าหรือเท่ากับ 0");
         this.score += score;
    }





}
