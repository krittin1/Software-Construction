package hw;

public class    AlphabetCounter {
    private String str;

    public AlphabetCounter() {
        this.str = "";
    }

    public void addSentence(String sentence){
       this.str = this.str.concat(sentence).toLowerCase();
    }

    public int countAlphabet(char ch){
        String s = ch+"";
         s= s.toLowerCase();
        int count=0;
        for (int i=0; i< this.str.length();i++){
            if( s.charAt(0) == this.str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public String getStr() {
        return str;
    }
}
