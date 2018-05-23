package Controllers;

import Main.DifficultyDialog;
import Main.HowToPlayDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import Main.Main;
import Main.GridClass;
import javafx.stage.Stage;


public class HomeController {

    @FXML
    Button playBtn;
    @FXML
    Button HowToBtn;


    @FXML
    public void initialize() {
        playBtn.setOnAction(event -> {
            DifficultyDialog diff = new DifficultyDialog();
            int result = diff.difficulty();

            if ( result == 1 ){
                //easy
                System.out.println("easy");
                try{
                    PlayScreenController.difficulty = 1;
                    Parent root = FXMLLoader.load(getClass().getResource("../UI/PlayScreen.fxml"));
                    Main.primaryStage.setScene(new Scene(root));
                }catch (IOException e){
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
            else if (result == 2){
                //medium
                System.out.println("medium");
                try{
                    PlayScreenController.difficulty = 2;
                    Parent root = FXMLLoader.load(getClass().getResource("../UI/PlayScreen.fxml"));
                    Main.primaryStage.setScene(new Scene(root));
                }catch (IOException e){
                    System.out.println(e);
                }
            }
            else if (result == 3){
                //hard
                System.out.println("hard");
                try{
                    PlayScreenController.difficulty = 3;
                    Parent root = FXMLLoader.load(getClass().getResource("../UI/PlayScreen.fxml"));
                    Main.primaryStage.setScene(new Scene(root));
                }catch (IOException e){
                    System.out.println(e);
                }
            }
            else{
                //cancel
                //does nothing
            }
        });

        HowToBtn.setOnMouseClicked(e->{
            HowToPlayDialog dialog = new HowToPlayDialog();
        });
    }
}
