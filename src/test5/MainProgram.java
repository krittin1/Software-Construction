package test5;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target =  sc.next();

        Hangman hangman = new Hangman(target);
        System.out.println(hangman.draw());

        while(true){
            if(hangman.isLose()||hangman.isWin()){
                if(hangman.isLose()){
                    System.out.println("You lose, the answer is "+target);
                }
                else{
                    System.out.println("Congratulations, you win");
                }
                break;
            }

            hangman.check(sc.next().charAt(0));
            System.out.println(hangman.draw());
        }

    }

}
