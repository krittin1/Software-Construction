package test1;

public class Fraction {
    private int  numerator;
    private int denominator;
    public Fraction (int numerator, int denominator){
        this.numerator = numerator;  // local
        this.denominator = denominator;

    }
    public int getDenominator(){
        return denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public String toString(){
        return numerator + "/" + denominator;
    }
}




