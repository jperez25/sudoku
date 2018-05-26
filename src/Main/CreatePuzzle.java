package Main;

import java.util.Arrays;
import java.util.Random;

public class CreatePuzzle {
    private int[][] puzzle = new int[9][9];
    private Random random = new Random();
    private boolean[] rowTracker = new boolean[9];
    private boolean[] colTracker = new boolean[9];

    private int[][] recusivePuzzle(int iterationNum){
        Random random = new Random();
        Arrays.fill(rowTracker, Boolean.TRUE);
        Arrays.fill(colTracker, Boolean.TRUE);
        if(iterationNum > 9){

        }else{
            int col;
            int row;
            boolean foundRow;
            boolean foundCol;
            //upper left box
            System.out.println("made it to box one with " + iterationNum);
            boolean box = false;
            while(!box){
                foundCol = false;
                foundRow = false;
                int randomRow = random.nextInt(3);
                int randomCol = random.nextInt(3);

                while(!rowTracker[randomRow]){
                    randomRow = random.nextInt(3);
                }
                foundRow = true;
                while(!colTracker[randomCol]){
                    randomCol = random.nextInt(3);
                }
                foundCol = true;
                if (puzzle[randomRow][randomCol] == 0){
                    if((foundCol) && (foundRow)){
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //upper middle box
            System.out.println("made it to box two with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }


            }

            //upper right box
            System.out.println("made it to box three with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle left box
            System.out.println("made it to box four with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle middle box
            System.out.println("made it to box five with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //middle right box
            System.out.println("made it to box six with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower left box
            System.out.println("made it to box seven with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower middle box
            System.out.println("made it to box eight with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }
            //lower right box
            System.out.println("made it to box nine with " + iterationNum);
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
                        puzzle[randomRow][randomCol] = iterationNum;
                        box = true;
                        rowTracker[randomRow] = false;
                        colTracker[randomCol] = false;
                    }
                }
            }



            recusivePuzzle(iterationNum++);
        }


        return puzzle;
    }
}

