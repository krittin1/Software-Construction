package test3;


//elab-source: NormalNote.java
public class NormalNote {
    private char note;
    private int amount;

    public NormalNote(char note,int amount) {
        this.note = note;
        this.amount = amount;
    }

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        String pattern = "";
        for (int i = 0;i < amount;i++){
            pattern +=note;
        }
        return pattern;
    }
}