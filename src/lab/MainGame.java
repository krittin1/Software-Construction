package lab;

import java.util.Scanner;

public class MainGame {

    static int fif , tir;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("!!!!   Monster Fight  !!!!");
        System.out.println("Please input monster1 name hp atk def : ");
        Monster m1 = new Monster(sc.next(), fif = sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Please input monster2 name hp atk def : ");
        Monster m2 = new Monster(sc.next(),tir = sc.nextInt(),sc.nextInt(),sc.nextInt());
        MonsterFight s1 = new MonsterFight(0);
        MonsterFight s2 = new MonsterFight(0 );
        int i=1;

        while(true) {

            System.out.println();
            System.out.println("Round : " + i);
            System.out.println(">>> Monster 1 turn <<<");

            if ( s1.checkSet1() ) {
                System.out.println("Please enter skill A=attack H=heal");
                String choice1 = sc.next();

                if (choice1.equalsIgnoreCase("a")) {

                        m2.attack(m1, m2);
                        m1.monsterInfo(m1, m2,fif,tir);

                    } else if (choice1.equalsIgnoreCase("h")) {
                        System.out.println("Please enter recovery hp : ");

                        m1.heal(m1, sc.nextInt(), fif);
                        m1.monsterInfo(m1, m2,fif,tir);
                        s1.addSet1(1);
                    }
                }
                else{
                    System.out.println("Monster 1 Can't use skill");
                    s1.addSet1(0);
                }

                if (m1.lose(m1) || m2.lose(m2)) {
                    m1.winner(m1, m2,fif);
                    m2.winner(m2, m1,tir);
                break;
            }

            System.out.println(">>> Monster 2 turn <<<");

            if ( s2.checkSet1()) {
                    System.out.println("Please enter skill A=attack H=heal");
                    String choice2 = sc.next();

                    if (choice2.equalsIgnoreCase("a") && s2.checkSet1()) {

                        m1.attack(m2, m1);
                        m2.monsterInfo(m1, m2,fif,tir);

                    } else if (choice2.equalsIgnoreCase("h")) {
                        System.out.println("Please enter recovery hp : ");
                        m2.heal(m2, sc.nextInt(), tir);
                        m2.monsterInfo(m1, m2,fif,tir);
                        s2.addSet1(1);
                    }
                }
                else{
                    System.out.println("Monster 2 Can't use skill");
                    s2.addSet1(0);
                }

                i = i + 1;

                if (m1.lose(m1) || m2.lose(m2)) {

                m1.winner(m1, m2,fif);
                m2.winner(m2, m1,tir);
                break;
                }
        }
    }
}
