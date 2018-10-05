package test3;

public class Game {
    private int target;
    private int player;


    public Game(int player,int target) {

        this.player = player;
        this.target = target;
    }

    public int getTarget()
    {

        return target;
    }

    public int getPlayer() {

        return player;
}

    public void  checkTarget( int player){
        if ( player == target){
            System.out.println("correct");
        }
        else if ( player > target){
            System.out.println("too high");
        }
        else {
            System.out.println("too low");
        }
    }

}
