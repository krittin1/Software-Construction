//elab-source:PositiveMixedFraction.java

public class PositiveMixedFraction {
    private long wholeNumber, nominator, denominator ;
    public PositiveMixedFraction() {
        this.wholeNumber = 0 ;
        this.nominator = 0 ;
        this.denominator = 1 ;
    }
    public PositiveMixedFraction(long wholeNumber, long nominator, long denominator) {
        if(denominator <= 0 || wholeNumber <= 0 || nominator <= 0) {
            throw new RuntimeException() ;
        } if(nominator > denominator) {
            wholeNumber += nominator/denominator ;
            nominator = nominator%denominator ;
            if(nominator == 0) {
                denominator = 1 ;
            }
        } if(nominator == denominator) {
            wholeNumber++ ;
            denominator = 1 ;
            nominator = 0 ;
        }
        this.wholeNumber = wholeNumber ;
        this.nominator = nominator ;
        this.denominator = denominator ;
    }

    public long getWholeNumber() {
        return wholeNumber;
    }

    public long getNominator() {
        return nominator;
    }

    public long getDenominator() {
        return denominator;
    }
}
