package Main;

import java.util.Arrays;
import java.util.Random;

public class CreatePuzzle {
    //This is the puzzle we return
    private int[][] puzzle = new int[9][9];
    //used to get numbers between 1-9
    private Random random;
    //used to keep track of rows and columns
    private boolean[] rowTracker = new boolean[9];
    private boolean[] colTracker = new boolean[9];


    //public default constructor
    public CreatePuzzle(){}

    //Return the puzzle
    public int[][] getPuzzle(){
         return recursivePuzzleV2(1);
    }

    public int rec(int rec){
        if (rec > 9){
            return rec;
        }
        else{
            rec++;
           return rec(rec);
        }
    }

    //Recursive method to generate a 9x9 sudoku puzzle
    private int[][] recursivePuzzle(int callNumber){
        random = new Random();

        //I dont know what these statements are for
        Arrays.fill(rowTracker, Boolean.TRUE);
        Arrays.fill(colTracker, Boolean.TRUE);

        //return puzzle if callNumber is greater than 9
        if(callNumber > 9){
            return puzzle;
        }
        //A bunch of stuff
        else{
            int col;
            int row;
            boolean foundRow;
            boolean foundCol;
            boolean box;

            //upper left box(1)
            System.out.println("made it to box one with " + callNumber);
            box = false;
            while(!box){
                foundCol = false;
                foundRow = false;

                //Random Number between 0 and 3
                int randomRow = random.nextInt(3);
                int randomCol = random.nextInt(3);

                //checks rows 1-3
                //I dont get the point of this
                //they all are true
                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3);
                }
                foundRow = true;

                //checks cols 1-3
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3);
                }
                foundCol = true;

                //assigns
                if (puzzle[randomRow][randomCol] == 0){
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }


            //upper middle box(4)
            System.out.println("made it to box two with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3);
                int randomCol = random.nextInt(3) + 3;

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3);
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +3;
                }
                foundCol = true;
                if (puzzle[randomRow][randomCol] == 0){
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }


            }

            //upper right box(7)
            System.out.println("made it to box three with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3);
                int randomCol = random.nextInt(3) +6;



                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3);
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +6;
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle left box
            System.out.println("made it to box four with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +3;
                int randomCol = random.nextInt(3);

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +3;
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3);
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle middle box
            System.out.println("made it to box five with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +3;
                int randomCol = random.nextInt(3) +3;

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +3;
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +3;
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle right box
            System.out.println("made it to box six with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +3;
                int randomCol = random.nextInt(3) +6;

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +3;
                }
                foundRow = true;

                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +6;
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower left box
            System.out.println("made it to box seven with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +6;
                int randomCol = random.nextInt(3);

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +6;
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3);
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower middle box
            System.out.println("made it to box eight with " + callNumber);
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +6;
                int randomCol = random.nextInt( 3) +3;

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +6;
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +3;
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower right box
            System.out.println("made it to box nine with " + callNumber+"\n");
            box = false;
            while (!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3) +6;
                int randomCol = random.nextInt( 3) +6;

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3) +6;
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3) +6;
                }
                foundCol = true;

                if(puzzle[randomRow][randomCol] == 0) {
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = callNumber;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }


            callNumber++;
           return recursivePuzzle(callNumber);
        }
    }


    private  int[][] recursivePuzzleV2(int callNumber){
        random = new Random();

        //I dont know what these statements are for
        Arrays.fill(rowTracker, Boolean.TRUE);
        Arrays.fill(colTracker, Boolean.TRUE);

        //return puzzle if callNumber is greater than 9
        if(callNumber >= 10){
            return puzzle;
        }
        //I simplified your code
        else{
            /*
            1 4 7
            2 5 8
            3 6 9
             */
            //box 1
            checkingTheBoxes(3,0,0,callNumber);
            //box 2
            checkingTheBoxes(3,3,0,callNumber);
            //box 3
            checkingTheBoxes(3,6,0,callNumber);

/*
            //box 4
            checkingTheBoxes(3,0,3,callNumber);
            //box 5
            checkingTheBoxes(3,3,3,callNumber);
            //box 6
            checkingTheBoxes(3,6,3,callNumber);


            //box 7
            checkingTheBoxes(3,0,6,callNumber);
            //box 8
            checkingTheBoxes(3,3,6,callNumber);
            //box 9
            checkingTheBoxes(3,6,6,callNumber);
*/

            System.out.println();

            return recursivePuzzleV2(++callNumber);
        }
    }

    private void checkingTheBoxes(int lowerBound, int maxBoundRow, int maxBoundCol, int callNumber){
        System.out.println("made it to box "+callNumber+" with " + callNumber);
        boolean box = false;
        while (!box){
            boolean foundCol = false;
            boolean foundRow = false;
            int randomRow = random.nextInt(lowerBound) +maxBoundRow;
            int randomCol = random.nextInt( lowerBound) +maxBoundCol;

            while(!rowTracker[randomRow]){
                randomRow = random.nextInt(lowerBound) +maxBoundRow;
            }
            foundRow = true;
            while(!colTracker[randomCol]){
                randomCol = random.nextInt(lowerBound) +maxBoundCol;
            }
            foundCol = true;

            if(puzzle[randomRow][randomCol] == 0) {
                if((foundCol) && (foundRow)){
                    puzzle[randomRow][randomCol] = callNumber;
                    box = true;
                    rowTracker[randomRow] = false;
                    colTracker[randomCol] = false;
                }
            }
        }
    }
}

