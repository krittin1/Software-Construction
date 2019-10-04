package application;

import javafx.beans.property.SimpleStringProperty;

public class Vocab {
    private final SimpleStringProperty wordinput;
    private final SimpleStringProperty partOfSpeechinput;
    private final SimpleStringProperty meaninginput;
    private final SimpleStringProperty exampleinput;

    public Vocab(String wordinput, String partOfSpeechinput, String meaninginput, String exampleinput) {
        this.wordinput = new SimpleStringProperty(wordinput);
        this.partOfSpeechinput = new SimpleStringProperty(partOfSpeechinput);
        this.meaninginput = new SimpleStringProperty(meaninginput);
        this.exampleinput =  new SimpleStringProperty(exampleinput);
    }

    public String getMeaninginput() {
        return meaninginput.get();
    }

    public String getPartOfSpeechinput() {
        return partOfSpeechinput.get();
    }

    public String getWordinput() {
        return wordinput.get();
    }

    public String getExampleinput() {
        return exampleinput.get();
    }


}
