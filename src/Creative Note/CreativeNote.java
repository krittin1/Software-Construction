package test3;

//elab-source: CreativeNote.java


public class CreativeNote extends NormalNote{

    public CreativeNote(char size, int amount) {
        super(size, amount);
    }

    @Override
    public String toString() {
        String pattern = "";
        for(int i = 0;i < getAmount();i++){
            pattern += (char)(getNote());
        }
        if(getNote() == 'G'){
            setNote('A');
        }
        else {
            setNote((char)(getNote()+1));
        }
        return pattern;
    }
}