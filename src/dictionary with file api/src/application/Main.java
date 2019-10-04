package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("page.fxml"));
        primaryStage.setTitle("Dictionary Application");
        primaryStage.setScene(new Scene(root, 1200, 675));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {

        launch(args);


    }

//    @Override
//    public void stop() throws Exception {
//        try{
//            Controller.getInstance().addVocab();
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//


}
