package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jdk.nashorn.api.tree.Tree;

import java.util.Set;
import java.util.TreeMap;

public class Dictionary {

    TreeMap<String, Vocabulary> vocabularyTreeMap = new TreeMap<>();


    public ObservableList getObserver() {
        ObservableList<Vocabulary> vocabularyObservableList = FXCollections.observableArrayList();
        for (Vocabulary i : vocabularyTreeMap.values()) {
            vocabularyObservableList.add(i);
        }
        return vocabularyObservableList;
    }


    public void add(String word, Vocabulary vocabulary){
        if(!vocabularyTreeMap.containsKey(word)){
            vocabularyTreeMap.put(word,vocabulary);
        }
    }

    public void remove(String word){
        if (vocabularyTreeMap.containsKey(word)){
            vocabularyTreeMap.remove(word);
        }


    }


    public boolean edit(String word){
        if (vocabularyTreeMap.containsKey(word)){
            return true;
        }
        return false;
    }

    public String getWord(String word){
        if (vocabularyTreeMap.containsKey(word)){
            return word;
        }
        return null;
    }

    public Vocabulary getValue(String word){
        if (vocabularyTreeMap.containsKey(word)){
            return vocabularyTreeMap.get(word);
        }
        return null;
    }


    public String format(MyFormatter format){
        return format.format(this);

    }

    public TreeMap<String, Vocabulary> getVocab(){
        return vocabularyTreeMap;
    }

    public Set<String> getWordList(){
        return vocabularyTreeMap.keySet();
    }

    public int sizeofKeySet(){
        return vocabularyTreeMap.keySet().size();
    }










}
