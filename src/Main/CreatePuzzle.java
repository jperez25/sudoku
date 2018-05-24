package Main;

import java.util.Random;

public class CreatePuzzle {
    private int[][] puzzle = new int[9][9];
    private Random random = new Random();

    public void refactorPuzzle(){

        int row = 0;
        int col = 0;
        int iterationNum = 0;
        int buffer;

        while (puzzle[8][8]== 0){
            boolean one = false;
            boolean two = false;
            boolean three = false;
            boolean four = false;
            boolean five = false;
            boolean six = false;
            boolean seven = false;
            boolean eight = false;
            boolean nine = false;
            row = iterationNum;
            col = iterationNum;
            //check the rows
            while (puzzle[row][0] != 0){
                //we need to find the numbers already in the thing;
                switch (puzzle[row][0]){
                    case 1: one = true; break;
                    case 2: two = true; break;
                    case 3: three = true; break;
                    case 4: four = true; break;
                    case 5: five = true; break;
                    case 6: six = true; break;
                    case 7: seven = true; break;
                    case 8: eight = true; break;
                    case 9: nine = true; break;
                    default:break;
                }
                row++;
            }
            //now that we know what numbers exist we need to populate the ones that don't with respect to what is in there
            row = iterationNum;
            while(puzzle[row][8] !=0){
                buffer = random.nextInt(9)+1;
                switch (buffer){
                    case 1:
                        if (!one){
                        puzzle[row][col] = buffer;
                        one = true;
                            row++;
                         }
                        break;
                    case 2:
                        if (!two){
                            puzzle[row][col] = buffer;
                            two = true;
                            row++;
                        }
                        break;
                    case 3:
                        if (!three){
                            puzzle[row][col] = buffer;
                            three = true;
                            row++;
                        }
                        break;
                    case 4:
                        if (!four){
                            puzzle[row][col] = buffer;
                            four = true;
                            row++;
                        }
                        break;
                    case 5:
                        if (!five){
                            puzzle[row][col] = buffer;
                            five = true;
                            row++;
                        }
                        break;
                    case 6:
                        if (!six){
                            puzzle[row][col] = buffer;
                            six = true;
                            row++;
                        }
                        break;
                    case 7:
                        if (!seven){
                            puzzle[row][col] = buffer;
                            seven = true;
                            row++;
                        }
                        break;
                    case 8:
                        if (!eight){
                            puzzle[row][col] = buffer;
                            eight = true;
                            row++;
                        }
                        break;
                    case 9:
                        if (!nine){
                            puzzle[row][col] = buffer;
                            nine = true;
                            row++;
                        }
                        break;
                }
            }
            //now we need to do it for the column
            row = iterationNum;
            col = iterationNum;
            while (puzzle[0][col] != 0){
                //we need to find the numbers already in the thing;
                switch (puzzle[0][col]){
                    case 1: one = true; break;
                    case 2: two = true; break;
                    case 3: three = true; break;
                    case 4: four = true; break;
                    case 5: five = true; break;
                    case 6: six = true; break;
                    case 7: seven = true; break;
                    case 8: eight = true; break;
                    case 9: nine = true; break;
                    default:break;
                }
                col++;
            }
            //now that we know what numbers exist we need to populate the ones that don't with respect to what is in there
            col = iterationNum;
            while(puzzle[8][col] !=0){
                buffer = random.nextInt(9)+1;
                switch (buffer){
                    case 1:
                        if (!one){
                            puzzle[row][col] = buffer;
                            one = true;
                            col++;
                        }
                        break;
                    case 2:
                        if (!two){
                            puzzle[row][col] = buffer;
                            two = true;
                            col++;
                        }
                        break;
                    case 3:
                        if (!three){
                            puzzle[row][col] = buffer;
                            three = true;
                            col++;
                        }
                        break;
                    case 4:
                        if (!four){
                            puzzle[row][col] = buffer;
                            four = true;
                            col++;
                        }
                        break;
                    case 5:
                        if (!five){
                            puzzle[row][col] = buffer;
                            five = true;
                            col++;
                        }
                        break;
                    case 6:
                        if (!six){
                            puzzle[row][col] = buffer;
                            six = true;
                            col++;
                        }
                        break;
                    case 7:
                        if (!seven){
                            puzzle[row][col] = buffer;
                            seven = true;
                            col++;
                        }
                        break;
                    case 8:
                        if (!eight){
                            puzzle[row][col] = buffer;
                            eight = true;
                            col++;
                        }
                        break;
                    case 9:
                        if (!nine){
                            puzzle[row][col] = buffer;
                            nine = true;
                            col++;
                        }
                        break;
                }
            }



            iterationNum++;
        }
    }
}
