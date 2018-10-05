package test7;

import java.util.ArrayList;

public class Dictonary {
    private ArrayList<Vocab> vocabulary;
    public Dictonary(){
        vocabulary = new ArrayList();

    }
    public void add(Vocab v){
        vocabulary.add(v);
    }
    public String find(String word){
        for (int i = 0; i < vocabulary.size();i++){
            if(vocabulary.get(i).getWord().equals(word)){

                return vocabulary.get(i).toString() ;
            }
        }
        return "Not Found";
    }

}








