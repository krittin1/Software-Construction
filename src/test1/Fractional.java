package test1;

public class Fractional {
    public String add(Fraction f1,Fraction f2){
        int denominator = f1.getDenominator() * f2.getDenominator();
        int numerator = f1.getNumerator() * f2.getDenominator()
                +
                f1.getDenominator() * f2.getNumerator();
        return numerator + "/" + denominator;
    }
}





