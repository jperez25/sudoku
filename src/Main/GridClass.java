package Main;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

public class GridClass extends GridPane{

    private GridPane grid;

    public GridClass(){
        grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setLayoutX(200.0);
        grid.setLayoutY(150.0);

        int col = 0;
        for (int r = 0; r < 9; r++) {
            GridPane gr = new GridPane();
            gr.setGridLinesVisible(true);

            for (int c = 0; c < 9; c++) {
                //here we use CreatePuzzle and Random to assign the numbers
                int number = 9 * r + c;
                CellClass cell = new CellClass(number);

                if(c < 3){
                    gr.add(cell.getCell(), c, r);
                }
                else if(c == 3){
                    gr.add(cell.getCell(), c%3, r+1);
                }
                else if(c > 3 && c < 6){
                    gr.add(cell.getCell(), c%3, r+1);
                }
                else if(c == 6){
                    gr.add(cell.getCell(), c%3, r+2);
                }
                else{
                    gr.add(cell.getCell(), c%3, r+2);
                }

            }
            grid.add(gr,col,r <= 2? r : r%3);

            /*
            grid is drawn like this
            1 4 7
            2 5 8
            3 6 9
             */

            //increase col every three iterations
            if((r+1)%3 == 0){
                col++;
            }
        }
    }

    public GridPane getGrid(){
        return grid;
    }
}
