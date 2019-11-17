package tutorial;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private List<Vocabulary> dict = new ArrayList<>();

    public void add(Vocabulary vocab){
        dict.add(vocab);
    }


    public String search(String vocab){
        String str;
        for (Vocabulary i : dict){
            if (vocab.equals(i.getName())){
                return i.toString();
            }



        }
        return  "Not found \"" + vocab + "\" in Dictionary.";
    }


    public int getSize(){

        return dict.size();
    }
}
