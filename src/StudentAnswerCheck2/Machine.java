package lab;

public class Machine {

    private String answer;
    private  int[] answerCount;


    public Machine(String answer) {
        this.answer = answer;
        this.answerCount = new int[answer.length()];
        for(int i = 0 ;i < answer.length();i++){
            this.answerCount[i] = 0;
        }
    }

    public int[] getAnswerCount() {
        return answerCount;
    }

    public String getAnswer() {
        return answer;
    }

    public int checkAnswer( AnswerSheet student){
        int correct=0;
        for (int i=0; i < answer.length();i++){
            if (answer.charAt(i) == student.getSheet().charAt(i)){
                correct++;
            }

        }
        return correct;
    }

    public double average( AnswerSheet[] marks ){
        double sum=0;
        for (int i =0; i < marks.length;i++){
            sum = sum + marks[i].getScore();

        }
        return sum/marks.length;


    }

   public void checkAnswerSheet( AnswerSheet student ){
       int correct=0;
       for (int i=0; i < answer.length();i++){
           if (answer.charAt(i) == student.getSheet().charAt(i)){
               correct++;
              this.answerCount[i] = this.answerCount[i]+1;
           }

       }
   }
}
