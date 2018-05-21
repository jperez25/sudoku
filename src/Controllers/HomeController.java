package Controllers;

import Main.DifficultyDialog;
import Main.HowToPlayDialog;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class HomeController {

    @FXML
    Button playBtn;
    @FXML
    Button HowToBtn;


    @FXML
    public void initialize() {
        playBtn.setOnMouseClicked(event -> {
            DifficultyDialog diff = new DifficultyDialog();

            if ( diff.difficulty() == 1 ){
                //easy
            }
            else if (diff.difficulty() == 2){
                //medium
            }
            else if (diff.difficulty() == 3){
                //hard
            }
            else{
                //cancel
            }
        });

        HowToBtn.setOnMouseClicked(e->{
            HowToPlayDialog dialog = new HowToPlayDialog();
        });
    }
}
