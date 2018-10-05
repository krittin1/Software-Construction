package test5;

public class Hangman {
    private int count ;
    private String target ;

    private char[] guess;

    public Hangman(String target) {
        this.target = target.toLowerCase();
        count = 6;
        this.guess = new char[target.length()];
        for(int i =0;i<this.guess.length;i++){
            this.guess[i]='-';
        }

    }

    public void check(char guess){
        boolean isCorrect = false;
        for (int i = 0; i < target.length() ; i++) {
            if(target.charAt(i) == guess){
                this.guess[i]=guess;
                isCorrect = true;
            }
        }
        if(!isCorrect) count--;
    }



   public String draw() {


       String temp = "";
       for (int i = 0; i < this.guess.length; i++) {
           temp += guess[i] + "";
       }
       switch (count) {

           case 1:
               return count+" "+temp;
           case 2:
               return count+" "+temp;

           case 3:
               return count+" "+temp;

           case 4:
               return count+" "+temp;

           case 5:
               return count+" "+temp;

           case 6:
               return count+" "+temp;

           case 0:
               return count+" "+temp;

           default:
               return "\n";
       }
   }





    public boolean isWin(){
        for(int i =0;i<this.target.length();i++){
            if(this.target.charAt(i) != this.guess[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isLose(){
        if(this.count <= 0){
            return true;
        }
        return false;
    }
}



