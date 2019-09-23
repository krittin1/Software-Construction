package hw;

public class MainAlpha {

    public static void main(String[] args) {
        AlphabetCounter counter = new AlphabetCounter();
        counter.addSentence("Subscribe Premium Account");
        System.out.println(counter.countAlphabet('S')); // print 2
        System.out.println(counter.countAlphabet('u')); // print 3
        counter.addSentence("Scott Summers");
        System.out.println(counter.countAlphabet('S')); // print 5

    }
}
