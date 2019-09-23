public class Machine {

    private String answer;


    public Machine(String answer) {
        this.answer = answer;
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


}
