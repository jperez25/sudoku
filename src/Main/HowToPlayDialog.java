package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import java.io.IOException;

public class HowToPlayDialog {

    Alert alert;

    String HowToPlay;

    //Creates a dialog box that explains how to play sudoku
    public HowToPlayDialog(){
        HowToPlay = "The goal of Sudoku is to get numbers 1-9 in all rows boxes in columns, but there can not be two of any particular number in a box, row, or column. If a number is repeated " +
                "you probably put a wrong number down somewhere.";

        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sudoku");
        alert.setHeaderText("How to play Sudoku");
        alert.setContentText("I have a great message for you!");

        Label label = new Label("How to play Sudoku:");

        TextArea textArea = new TextArea(HowToPlay);
        textArea.setEditable(false);
        textArea.setWrapText(true);

        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);

        GridPane.setVgrow(textArea, Priority.ALWAYS);
        GridPane.setHgrow(textArea, Priority.ALWAYS);
        GridPane expContent = new GridPane();

        expContent.setMaxWidth(Double.MAX_VALUE);
        expContent.add(label, 0, 0);
        expContent.add(textArea, 0, 1);


        //we could change this to load from a file so it's easy to edit
        alert.getDialogPane().setContent(expContent);

        alert.showAndWait();
    }
}
