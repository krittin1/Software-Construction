public class Student {
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
        score = 0;
    }


    public double getScore() {
        return score;
    }


    public String getName() {
        return name;
    }


    public void addScore(double score){
        this.score += score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
