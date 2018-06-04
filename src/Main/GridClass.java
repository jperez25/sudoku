package Main;

import Controllers.PlayScreenController;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import java.util.Random;

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

        int numbersOfCellsForTheDifficutly = 0;
        int numsPerSmallGrid = 0;
        int number;
        CellClass cell = null;
        int col = 0;
        for (int r = 0; r < 9; r++) {
            GridPane gr = new GridPane();
            gr.setGridLinesVisible(true);

            numsPerSmallGrid = 0;

            for (int c = 0; c < 9; c++) {


                //depending on the difficulty we assign the puzzle to the cells
                switch (PlayScreenController.difficulty){
                    //easy, we give 30 cells
                    //about 3 numbers per 9x9 grid
                    case 1:
                        if (numsPerSmallGrid < 3){
                            Random rnd = new Random();
                            //we decide if cell has a number or is blank
                            if (rnd.nextBoolean()){
                                //get a random number from box 1-9
                                //bug is here
                                number = j[(int)Math.random()*3 +1][(int)Math.random()*3 +1];
                                numsPerSmallGrid++;
                                cell = new CellClass(number);
                            }
                            else{
                                cell = new CellClass();
                            }
                        }
                        else if(numsPerSmallGrid >= 3){
                            cell = new CellClass();
                        }
                        else{

                        }


                        break;
                     //medium we give 23 cells
                    case 2:
                        if (numsPerSmallGrid < 2){
                            Random rnd = new Random();
                            if (rnd.nextBoolean()){
                                number = j[(int)Math.random()*3 +1][(int)Math.random()*3 +1];
                                numsPerSmallGrid++;
                                cell = new CellClass(number);
                            }
                            else{
                                cell = new CellClass();
                            }
                        }
                        else if(numsPerSmallGrid >= 2){
                            cell = new CellClass();
                        }

                        break;
                     //hard we give 17 cells
                    case 3:
                        if (numsPerSmallGrid < 1){
                            Random rnd = new Random();
                            if (rnd.nextBoolean()){
                                number = j[(int)Math.random()*3 +1][(int)Math.random()*3 +1];
                                numsPerSmallGrid++;
                                cell = new CellClass(number);
                            }
                            else{
                                cell = new CellClass();
                            }
                        }
                        else if(numsPerSmallGrid >= 1){
                            cell = new CellClass();
                        }
                        break;
                     //I dunno
                    default:
                            break;
                }


                //where to add the cells
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
