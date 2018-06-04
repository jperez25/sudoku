package Main;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CellClass{

    private TextField cell;

    public CellClass(){
        cell = new TextField("");
        cell.setMaxWidth(40);
        cell.setMinWidth(40);
        cell.setMaxHeight(40);
        cell.setMinHeight(40);
        cell.setEditable(false);
    }
    public CellClass(int number){
        cell = new TextField(String.valueOf(number));
        cell.setMaxWidth(40);
        cell.setMinWidth(40);
        cell.setMaxHeight(40);
        cell.setMinHeight(40);
        cell.setEditable(false);
        cell.setStyle("-fx-background-color: gray");
    }



    public TextField getCell(){
        return cell;
    }


}
