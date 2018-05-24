package Controllers;

import Main.GridClass;
import Main.Main;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class PlayScreenController {
    public static int difficulty;

    @FXML
    Button TheButton;

    @FXML
    Pane parent;

    @FXML
    public void initialize(){

        GridClass gr = new GridClass();
        parent.getChildren().add(gr.getGrid());


        TheButton.setOnAction(event -> {
            System.out.println(difficulty);
        });


    }

}
