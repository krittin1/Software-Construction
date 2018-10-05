package test6;

public class MainProgram {
    public static void main (String[] args){


        MonsterBall b1 = new  MonsterBall("Poke Ball", 200.0,100.0, 1.0);
        MonsterBall b2 = new MonsterBall("Great Ball", 600.0, 300.0, 1.5);
        MonsterBall b3 = new MonsterBall("Ultra Ball", 1200.0, 600.0, 2.0);
        MonsterBall b4 = new MonsterBall("Drive Ball", 1000.0, 500.0, 3.5);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
    }
}
