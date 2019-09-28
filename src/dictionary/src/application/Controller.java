package application;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXML;
import javafx.scene.control.*;




public class Controller {

    @FXML
    TextField wordinput, partOfSpeechinput, meaninginput, search;

    @FXML
    TextArea exampleinput, format;

    @FXML
    TableView showallword;

    @FXML
    Button add, edit, remove, reset, searchBtn;

    @FXML
    ToggleButton  table, json, xml;

    @FXML
    TableColumn<Vocab, String> word, partOfSpeech, meaning, example;
    ObservableList<Vocab> observableList = FXCollections.observableArrayList();
    Dictionary dictionary = new Dictionary();

    public void initialize(){
        format.setVisible(false);
        showallword.setVisible(true);
        table.setSelected(true);
        xml.setSelected(false);
        json.setSelected(false);
        word.setCellValueFactory(new PropertyValueFactory<Vocab ,String>("wordinput"));
        partOfSpeech.setCellValueFactory(new PropertyValueFactory<Vocab ,String>("partOfSpeechinput"));
        meaning.setCellValueFactory(new PropertyValueFactory<Vocab ,String>("meaninginput"));
        example.setCellValueFactory(new PropertyValueFactory<Vocab ,String>("exampleinput"));
        showallword.setItems(observableList);
        start();
        show();
    }


    public  void start(){
        dictionary.add("iterator", new Vocabulary("iterator",
                "v.",
                "To say, or do again; repeat",
                "She kept reiterating her request."));
        dictionary.add("assert", new Vocabulary("assert",
                "v.",
                "1. To state strongly; affirm 2. to maintain or defend (claims, rights, etc.)",
                "He asserted his innocense."));
        dictionary.add("ambition", new Vocabulary("ambition",
                "n.",
                "something that you want to do or achieve very much",
                "His burning ambition was to study medicine."));
        dictionary.add("antidisestablishmentarianism", new Vocabulary("antidisestablishmentarianism",
                "n.",
                "Opposition to the disestablishment of the Church of England.",
                "Those who opposed disestablishmentarians, and there were many, particularly in Ireland and Wales, were thus supporters of antidisestablishmentarianism."));
        dictionary.add("buttress " , new Vocabulary("buttress ",
                "v.",
                "support physically; prop up; support something or someone by supplying evidence",
                "The attorney came up with several far-fetched arguments in a vain attempt to buttress his weak case."));
        dictionary.add("capricious", new Vocabulary("capricious",
                "adj.",
                "fickle; impulsive and unpredictable; apt to change opinions suddenly",
                "The storm was capricious: it changed course constantly."));
        dictionary.add("before", new Vocabulary("before",
                "con.",
                "during the period of time preceding (a particular event, date, or time).",
                "Before he leaves, make sure his room is clean."));
    }


    public  void show(){
        table.setSelected(true);
        xml.setSelected(false);
        json.setSelected(false);
        format.setVisible(false);
        observableList.clear();
        showallword.setVisible(true);
        for (Vocabulary i : dictionary.getVocab().values()){
            observableList.add(new Vocab(i.getWordinput(),
                    i.getPartOfSpeechinput().toLowerCase(),
                    i.getMeaninginput(),
                    i.getExampleinput()));

        }
    }

    @FXML
    public void addVocab(){
        if (!dictionary.edit(wordinput.getText())){
            dictionary.add(wordinput.getText(), new Vocabulary(wordinput.getText(),
                    partOfSpeechinput.getText(),
                    meaninginput.getText(),
                    exampleinput.getText()));

        }
        wordinput.clear();
        partOfSpeechinput.clear();
        meaninginput.clear();
        exampleinput.clear();
        show();
    }


    @FXML
    public void editVocab(){
        if (dictionary.edit(wordinput.getText())){
            wordinput.setText(dictionary.getValue(wordinput.getText()).getWordinput());
            partOfSpeechinput.setText(dictionary.getValue(wordinput.getText()).getPartOfSpeechinput());
            meaninginput.setText(dictionary.getValue(wordinput.getText()).getMeaninginput());
            exampleinput.setText(dictionary.getValue(wordinput.getText()).getExampleinput());
        }
    }

    @FXML
    public  void removeVocab(){
        if (dictionary.edit(wordinput.getText())){
            dictionary.remove(wordinput.getText());

        }
        wordinput.clear();
        partOfSpeechinput.clear();
        meaninginput.clear();
        exampleinput.clear();
        show();
    }


    public void searchVocab(){
        if (dictionary.edit(search.getText()) && showallword.isVisible()){
            observableList.clear();
            observableList.add(new Vocab(dictionary.getValue(search.getText()).getWordinput(),dictionary.getValue(search.getText()).getPartOfSpeechinput().toUpperCase(),
                    dictionary.getValue(search.getText()).getMeaninginput(),dictionary.getValue(search.getText()).getExampleinput()));
        }
        else if (dictionary.edit(search.getText()) && format.isVisible() && json.isSelected()){
            String temp = "[\n";
            temp += "\t{\n";
            temp += "\t\tVocab: \"" + dictionary.getValue(search.getText()).getWordinput() + "\"\n";
            temp += "\t\tpartOfSpeech: \"" + dictionary.getValue(search.getText()).getPartOfSpeechinput().toLowerCase() + "\"\n";
            temp += "\t\tmeaning: \"" + dictionary.getValue(search.getText()).getMeaninginput() + "\"\n";
            temp += "\t\texample: \"" + dictionary.getValue(search.getText()).getExampleinput() + "\"\n";
            temp += "\t}\n";
            format.setText(temp);
        }
        else if (dictionary.edit(search.getText()) && format.isVisible() && xml.isSelected() && !json.isSelected()){
            String temp = "<Dictionary>\n";
            temp += "\t<Vocab";
            temp += " word=" + "\"" + dictionary.getValue(search.getText()).getWordinput() + "\"" + ">\n";
            temp += "\t\t<PartOfSpeech>" + dictionary.getValue(search.getText()).getPartOfSpeechinput().toLowerCase() + "</PartOfSpeech>\n";
            temp += "\t\t<Meaning>" + dictionary.getValue(search.getText()).getMeaninginput() + "</Meaning>\n";
            temp += "\t\t<Example>" + dictionary.getValue(search.getText()).getExampleinput() + "</Example>\n";
            temp += "\t</Vocab>\n";
            temp += "</Dictionary>";
            format.setText(temp);
        }

    }


    @FXML
    public void tableBtnOnClick(){
        format.setVisible(false);
        showallword.setVisible(true);
        table.setSelected(true);
        xml.setSelected(false);
        json.setSelected(false);
    }

    @FXML
    public void xmlBtnOnClick(){
        showallword.setVisible(false);
        format.setVisible(true);
        table.setSelected(false);
        xml.setSelected(true);
        json.setSelected(false);
        format.setText(dictionary.format(new MyFormatter() {
            @Override
            public String format(Object obj) {
                String str = "<Dictionary>\n";
                for(String word: ((Dictionary)obj).getWordList()){
                    str += "\t<Vocab";
                    str += " word=" + "\"" + word + "\"" + ">\n";
                    str += "\t\t<PartOfSpeech>" + ((Dictionary)obj).getValue(word).getPartOfSpeechinput().toUpperCase() + "</PartOfSpeech>\n";
                    str += "\t\t<Meaning>" + ((Dictionary)obj).getValue(word).getMeaninginput() + "</Meaning>\n";
                    str += "\t\t<Example>" + ((Dictionary)obj).getValue(word).getExampleinput() + "</Example>\n";
                    str += "\t</Vocab>\n";
                }
                str += "</Dictionary>";
                return str;
            }
        }));

    }


    @FXML
    public void jsonBtnOnClick() {
        showallword.setVisible(false);
        format.setVisible(true);
        table.setSelected(false);
        xml.setSelected(false);
        json.setSelected(true);
        format.setText(dictionary.format(new MyFormatter() {
            @Override
            public String format(Object obj) {
                int count = 0;
                String str = "[\n";
                for(String word:((Dictionary)obj).getWordList()){
                    count += 1;
                    str += "\t{\n";
                    str += "\t\tVocab: \"" + word + "\"\n";
                    str += "\t\tpartOfSpeech: \"" + ((Dictionary)obj).getValue(word).getPartOfSpeechinput().toUpperCase() + "\"\n";
                    str += "\t\tmeaning: \"" + ((Dictionary)obj).getValue(word).getMeaninginput() + "\"\n";
                    str += "\t\texample: \"" + ((Dictionary)obj).getValue(word).getExampleinput() + "\"\n";
                    if(count != ((Dictionary)obj).sizeofKeySet()){
                        str += "\t},\n";
                    }
                    else{
                        str += "\t}\n";
                    }
                }
                str += "]";
                return str;
            }
        }));

    }



    }











