package test3;

//elab-source: Main.java
//elab-mainclass: Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if(size >=1 && size <= 100){
            NormalNote [] note = new NormalNote[size];
            String f = sc.nextLine();
            for(int i = 0;i < size;i++){
                String s = sc.next();
                if(s.equals("Normal")){
                    note[i] = new NormalNote(sc.next().charAt(0),sc.nextInt());
                }
                else{
                    note[i] = new CreativeNote(sc.next().charAt(0),sc.nextInt());
                }
            }

            int show = sc.nextInt();

            for(int i = 0;i < show;i++){
                for(int j = 0;j < note.length;j++){
                    System.out.print(note[j].toString());
                }
                System.out.println();
            }
        }
    }
}