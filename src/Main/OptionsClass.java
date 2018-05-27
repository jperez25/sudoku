package Main;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;



public class OptionsClass {
    private Pane pane = new Pane();

    public OptionsClass(){
        for (int i = 1; i <= 10; i++) {
            if (i == 10){
                Button bt = new Button("Erase");
                bt.setLayoutX(i*50);
                pane.getChildren().add(bt);
            }
            else{
                Button bt = new Button(Integer.toString(i));
                bt.setLayoutX(i*50);
                pane.getChildren().add(bt);
            }
        }
    }

    public Pane getPane(){
        return pane;
    }
}
