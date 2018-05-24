package Main;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GridClass extends GridPane{

    private GridPane grid;

    public GridClass(){
        grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setGridLinesVisible(true);
        grid.setLayoutX(200.0);
        grid.setLayoutY(150.0);

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int number = 9 * r + c;
                TextField button = new TextField(String.valueOf(number));
                button.setMaxWidth(40);
                grid.add(button, c, r);
            }

        }
    }

    public GridPane getGrid(){
        return grid;
    }
}
