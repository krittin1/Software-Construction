package sample;

public class GameController {
    private Monster m1, m2;
    private int turn; // -1 , 1
    private int round;


    public GameController(Monster m1, Monster m2){
        this.m1 = m1;
        this.m2 = m2;
        this.turn = 1;
        this.round = 1;

    }
    public void attackState(){
        if (turn > 0) {
            if (m2.getCanUseSkill()) {
                m2.attack(m1,m2);
            }
        }else {

            this.round++;
        }

        changeTurn();

    }
    public void healState(){

        changeTurn();
    }
    public boolean isWin(){
        if (m1.lose(m1) || m2.lose(m2)){
            return true;
        }
        return false;
    }
    public Monster getWinMonster(){
        if (m1.getHp() >= m2.getHp()){
            return m1;
        }
        return m2;
    }
    private void changeTurn(){
        this.turn *= -1;
    }

    public int getTurn() {
        return turn;
    }

    public int getRound() {
        return round;
    }
}
