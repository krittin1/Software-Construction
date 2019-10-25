package hw;

//elab-source:MainProgram.java
//elab-mainclass:MainProgram
import java.util.ArrayList;
import java.util.Collections;
public class MainProgram {
    public static void main(String[] args) {
        MonsterParty party = new MyParty();
        ArrayList<Monster> monsters = party.createMonsters();
        System.out.println(monsters);
        Collections.sort(monsters);
        System.out.println(monsters);
    }
}