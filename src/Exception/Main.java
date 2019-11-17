package test5;

//elab-source:Main.java

//elab-mainclass: Main

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        FinalExam exam = new FinalExam();

        try{
            exam.methodA(101);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        try{
            exam.methodB("James is the best Guys Forever Alone.");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }



        try {
            exam.methodC("filename,csv");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try{
            exam.methodD(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }



        try{
            exam.methodE(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }



    }
}
