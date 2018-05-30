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
        grid.setLayoutX(180.0);
        grid.setLayoutY(100.0);

        //here we use CreatePuzzle and Random to assign the numbers
        CreatePuzzle x = new CreatePuzzle();
        int[][] j = x.getPuzzle();
        //System.out.println(x.rec(1) );

        for (int num[] : j){
            for (int num2 : num){
                System.out.print(num2 + " ");
            }
            System.out.println();
        }

        int col = 0;
        for (int r = 0; r < 9; r++) {
            GridPane gr = new GridPane();
            gr.setGridLinesVisible(true);

            for (int c = 0; c < 9; c++) {

                int number = 9 * r + c;
                //depending on the difficulty we assign the puzzle to the cells
                switch (number){
                    //easy
                    case 1:
                        break;
                     //medium
                    case 2:
                        break;
                     //hard
                    case 3:
                        break;
                     //I dunno
                        default:
                            break;
                }
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
