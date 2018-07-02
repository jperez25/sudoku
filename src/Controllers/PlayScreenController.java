package Controllers;

import Main.*;
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
        OptionsClass options = new OptionsClass();
        parent.getChildren().add(gr.getGrid());
        parent.getChildren().add(options.getPane());

        //size is zero
        //ObservableList<Node> innerGrids = gr.getChildren();


        TheButton.setOnAction(event -> {
            System.out.println(difficulty);
            System.out.println(parent.getChildren().size());
        });

        TheButton.fire();

    }

}
