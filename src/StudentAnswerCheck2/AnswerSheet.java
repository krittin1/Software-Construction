package lab;

public class AnswerSheet {
    private String sheet;
    private int score;

    public AnswerSheet(String sheet) {
        this.sheet = sheet;
        this.score = 0;
    }

    public String getSheet() {
        return sheet;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
