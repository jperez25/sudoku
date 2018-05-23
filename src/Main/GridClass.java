package Main;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GridClass extends GridPane{

    private GridPane grid;

    public GridClass(){
        grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(20);
        grid.setVgap(20);

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int number = 9 * r + c;
                TextField button = new TextField(String.valueOf(number));
                grid.add(button, c, r);
            }
        }
    }

    public GridPane getGrid(){
        return grid;
    }
}
