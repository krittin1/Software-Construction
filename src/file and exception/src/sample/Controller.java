package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;

public class Controller {
    @FXML
    private ImageView image;

    @FXML
    private Button btnCreate;

    @FXML public void initialize(){
        image.setImage(new Image("images/samoyed.jpg"));
    }

    @FXML
    public void createFile(ActionEvent event){
        File file = new File("tmp/test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
