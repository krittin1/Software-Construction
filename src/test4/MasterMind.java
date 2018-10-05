package test4;

public class MasterMind {
    private String target;
    private String number;
    private int digit;
    private int position;

    public void setNumber(String number){
        this.number = number;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    public String calculate(MasterMind player1,MasterMind player2){
        String start[] = new String[4];
        String pre[] = new String[4];
        for(int i=0;i<4;i++){
            start[i] = String.valueOf(player1.target.charAt(i));
            pre[i] = String.valueOf(player2.number.charAt(i));
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if((pre[i].equals(start[j])) && (i==j)){
                    digit+=1;
                    position+=1;
                }
                else if((pre[i].equals(start[j]))){
                    digit+=1;
                }
            }
        }
        if(digit == 4 && position == 4){
            return "Congratulations, you just mastered my mind!!";
        }
        else{
            return String.valueOf(digit) +" "+ String.valueOf(position);
        }
    }
}

