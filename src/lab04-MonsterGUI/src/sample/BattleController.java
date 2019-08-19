package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URISyntaxException;

public class BattleController {

    private Monster m1, m2;

    private GameController gameController;

    @FXML
    ImageView m1Image, m2Image;

    @FXML public void initialize(){

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    m1Image.setImage(new Image(getClass().getResource(m1.getImgPath()).toURI().toString()));
                    m2Image.setImage(new Image(getClass().getResource(m2.getImgPath()).toURI().toString()));

                    gameController = new GameController(m1, m2);
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setMonster1(Monster m){
        this.m1 = m;
    }
    public void setMonster2(Monster m){
        this.m2 = m;
    }

    @FXML public void handleAtkBtnOnAction(ActionEvent event){

        // call atk method in gameController

        // check isWin
        if (gameController.isWin()) {


        }

        // display

    }

    @FXML public void handleHealBtnOnAction(ActionEvent event){

    }

    public void display(){
        // call display next turn monster attribute



        // call display next turn monster image


    }




}
