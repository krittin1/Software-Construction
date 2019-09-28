package application;

public class Vocabulary {

    private String wordinput;
    private String partOfSpeechinput;
    private String meaninginput;
    private String exampleinput;

    public Vocabulary(String wordinput, String partOfSpeechinput, String meaninginput, String exampleinput) {
        this.wordinput = wordinput;
        this.partOfSpeechinput = partOfSpeechinput;
        this.meaninginput = meaninginput;
        this.exampleinput = exampleinput;
    }


    public String getWordinput() {
        return wordinput;
    }

    public String getPartOfSpeechinput() {
        return partOfSpeechinput;
    }

    public String getMeaninginput() {
        return meaninginput;
    }

    public String getExampleinput() {
        return exampleinput;
    }

    public void setWordinput(String wordinput) {
        this.wordinput = wordinput;
    }

    public void setPartOfSpeechinput(String partOfSpeechinput) {
        this.partOfSpeechinput = partOfSpeechinput;
    }

    public void setMeaninginput(String meaninginput) {
        this.meaninginput = meaninginput;
    }

    public void setExampleinput(String exampleinput) {
        this.exampleinput = exampleinput;
    }
}
