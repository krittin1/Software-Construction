package test7;

public class Vocab {
    private String word;
    private String type;
    private String meaning;
    private String example;

    public Vocab (String word, String type,String meaning, String example){
        this.word = word;
        this.type = type;
        this.meaning = meaning;
        this.example = example;

    }
    public String getWord() {
        return word;
    }
    public String getType() {
        return type;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getExample() {
        return example;
    }
    public String toString(){
        //return getWord()+getType()+getMeaning()+getExample();
        return  word + " : " + type + " : " + meaning + " : "+ example ;
    }
}







