package Main;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class DifficultyDialog {

    private Alert alert;
    private ButtonType buttonEasy;
    private ButtonType buttonMedium;
    private ButtonType buttonHard;
    private ButtonType buttonCancel;


    public DifficultyDialog(){

        alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Choose Difficulty");
        alert.setHeaderText("Choose Difficulty");

        buttonEasy = new ButtonType("Easy");
        buttonMedium = new ButtonType("Medium");
        buttonHard = new ButtonType("Hard");
        buttonCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonEasy, buttonMedium, buttonHard, buttonCancel);

    }


    public int difficulty(){
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonEasy){
            return 1;
        } else if (result.get() == buttonMedium) {
            return 2;
        } else if (result.get() == buttonHard) {
            return 3;
        } else {
            return 0;
        }
    }
}
