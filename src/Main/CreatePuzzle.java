package Main;

import java.util.Arrays;
import java.util.Random;

public class CreatePuzzle {
    //This is the puzzle we return
    private int[][] puzzle = new int[9][9];

    private Random random = new Random();
    private int[] whatRow = new int[10];
    private int[] whatCol = new int[10];

    private static void printArray(){

    }

    private int[][] recusivePuzzle(int iterationNum){
        Random random = new Random();
        int randomRow;
        int randomCol;

        if(iterationNum > 9){

        }else {
            int col;
            int row;
            //upper left box 1
            System.out.println("made it to box one with " + iterationNum);
            printArray();
            boolean box = false;
            while(!box){

                randomRow = random.nextInt(3);
                randomCol = random.nextInt(3);


                if (puzzle[randomRow][randomCol] == 0){

                    puzzle[randomRow][randomCol] = iterationNum;
                    box = true;
                    whatRow[1] = randomRow;
                    whatCol[1] = randomCol;

                }
            }
            //upper middle box 2
            System.out.println("made it to box two with " + iterationNum);
            printArray();

            box = false;
            while (!box) {
                randomRow = 0;
                switch (whatRow[1]){
                    case 0:
                        randomRow = random.nextInt(2) +1;
                        break;
                    case 1:
                        int buffer = random.nextInt(2);
                        if (buffer == 0){
                            randomRow = 0;
                        }else if (buffer ==1){
                            randomRow = 2;
                        }
                        break;
                    case 2:
                        randomRow = random.nextInt(2);
                        break;
                }
                randomCol = random.nextInt(3) +3;

                if (puzzle[randomRow][randomCol] == 0){

                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[2] = randomRow;
                    whatCol[2] = randomCol;
                    box = true;

                }
            }

            //upper right box 3
            System.out.println("made it to box three with " + iterationNum);
            printArray();

            box = false;
            while(!box){
                randomRow = 0;
                switch (whatRow[1]){
                    case 0:
                        switch (whatRow[2]){
                            //case one cannot exsit inside case one
                            case 1:
                                randomRow = 2;
                                break;
                            case 2:
                                randomRow = 1;
                                break;
                        }
                        break;
                    case 1:
                        switch (whatRow[2]){
                            case 0:
                                randomRow = 2;
                                break;
                            //case two cannot exsit inside case two
                            case 2:
                                randomRow = 0;
                                break;

                        }
                        break;
                    case 2:
                        switch (whatRow[2]){
                            case 0:
                                randomRow = 1;
                                break;
                            case 1:
                                randomRow = 0;
                                break;
                        }
                        break;
                }
                randomCol = random.nextInt(3) + 6;
                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[3] = randomRow;
                    whatCol[3] = randomCol;
                    box = true;
                }


            }
            //middle right box 4
            System.out.println("made it to box four with " + iterationNum);
            printArray();

            box = false;
            while (!box) {
                randomCol = 0;
                switch (whatCol[1]) {
                    case 0:
                        randomCol = random.nextInt(2) + 1;
                        break;
                    case 1:
                        int buffer = random.nextInt(2);
                        if (buffer == 0) {
                            randomCol = 0;
                        } else if (buffer == 1) {
                            randomCol = 2;
                        }
                        break;
                    case 2:
                        randomCol = random.nextInt(2);
                        break;
                }

                randomRow = random.nextInt(3) + 3;
                if (puzzle[randomRow][randomCol] == 0) {
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[4] = randomRow;
                    whatCol[4] = randomCol;
                    box = true;
                }
            }
            //bottom right box 7
            System.out.println("made it to box seven with " + iterationNum);
            printArray();

            box = false;
            while (!box) {
                randomCol = 0;
                switch (whatCol[1]){
                    case 0:
                        switch (whatCol[4]){
                            //case one cannot exsit inside case one
                            case 1:
                                randomCol = 2;
                                break;
                            case 2:
                                randomCol = 1;
                                break;
                        }
                        break;
                    case 1:
                        switch (whatCol[4]){
                            case 0:
                                randomCol = 2;
                                break;
                            //case two cannot exsit inside case two
                            case 2:
                                randomCol = 0;
                                break;

                        }
                        break;
                    case 2:
                        switch (whatCol[4]){
                            case 0:
                                randomCol = 1;
                                break;
                            case 1:
                                randomCol = 0;
                                break;
                        }
                        break;
                }


                randomRow = random.nextInt(3) + 6;
                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[7] = randomRow;
                    whatCol[7] = randomCol;
                    box = true;
                }
            }
            //middle middle box 5
            System.out.println("made it to box five with " + iterationNum);
            printArray();

            box = false;
            while (!box){

                randomRow = 0;
                switch (whatRow[4]){
                    case 3:
                        randomRow = random.nextInt(2) +4;
                        break;
                    case 4:
                        int buffer = random.nextInt(2);
                        if (buffer == 0){
                            randomRow = 3;
                        }else if (buffer ==1){
                            randomRow = 5;
                        }
                        break;
                    case 5:
                        randomRow = random.nextInt(2)+3;
                        break;
                }

                randomCol = 0;
                switch (whatCol[2]) {
                    case 3:
                        randomCol = random.nextInt(2) + 4;
                        break;
                    case 4:
                        int buffer = random.nextInt(2);
                        if (buffer == 0) {
                            randomCol = 3;
                        } else if (buffer == 1) {
                            randomCol = 5;
                        }
                        break;
                    case 5:
                        randomCol = random.nextInt(2) +3;
                        break;
                }

                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[5] = randomRow;
                    whatCol[5] = randomCol;
                    box = true;
                }
            }
            //bottom middle box 8
            System.out.println("made it to box eight with " + iterationNum);
            printArray();

            box = false;
            while (!box){
                randomRow = 0;
                switch (whatRow[7]){
                    case 6:
                        randomRow = random.nextInt(2) +7;
                        break;
                    case 7:
                        int buffer = random.nextInt(2);
                        if (buffer == 0){
                            randomRow = 6;
                        }else if (buffer ==1){
                            randomRow = 8;
                        }
                        break;
                    case 8:
                        randomRow = random.nextInt(2)+6;
                        break;
                }

                randomCol = 0;
                switch (whatCol[2]){
                    case 3:
                        switch (whatCol[5]){
                            //case one cannot exsit inside case one
                            case 4:
                                randomCol = 5;
                                break;
                            case 5:
                                randomCol = 4;
                                break;
                        }
                        break;
                    case 4:
                        switch (whatCol[5]){
                            case 3:
                                randomCol = 5;
                                break;
                            //case two cannot exsit inside case two
                            case 5:
                                randomCol = 3;
                                break;

                        }
                        break;
                    case 5:
                        switch (whatCol[5]){
                            case 3:
                                randomCol = 4;
                                break;
                            case 4:
                                randomCol = 3;
                                break;
                        }
                        break;
                }
                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[8] = randomRow;
                    whatCol[8] = randomCol;
                    box = true;
                }


            }
            //middle right box 6
            System.out.println("made it to box six with " + iterationNum);
            printArray();

            box = false;
            while (!box){
                randomRow = 0;
                switch (whatRow[4]){
                    case 3:
                        switch (whatRow[5]){
                            //case one cannot exsit inside case one
                            case 4:
                                randomRow = 5;
                                break;
                            case 5:
                                randomRow = 4;
                                break;
                        }
                        break;
                    case 4:
                        switch (whatRow[5]){
                            case 3:
                                randomRow = 5;
                                break;
                            //case two cannot exsit inside case two
                            case 5:
                                randomRow = 3;
                                break;

                        }
                        break;
                    case 5:
                        switch (whatRow[5]){
                            case 3:
                                randomRow = 4;
                                break;
                            case 4:
                                randomRow = 3;
                                break;
                        }
                        break;
                }
                randomCol = 0;
                switch (whatCol[3]) {
                    case 6:
                        randomCol = random.nextInt(2) + 7;
                        break;
                    case 7:
                        int buffer = random.nextInt(2);
                        if (buffer == 0) {
                            randomCol = 6;
                        } else if (buffer == 1) {
                            randomCol = 8;
                        }
                        break;
                    case 8:
                        randomCol = random.nextInt(2) +6;
                        break;
                }

                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[6] = randomRow;
                    whatCol[6] = randomCol;
                    box = true;
                }
            }
            //bottom right box 9
            System.out.println("made it to box nine with " + iterationNum);
            printArray();

            box = false;
            while (!box){
                randomRow = 0;
                switch (whatRow[7]){
                    case 6:
                        switch (whatRow[8]){
                            //case one cannot exsit inside case one
                            case 7:
                                randomRow = 8;
                                break;
                            case 8:
                                randomRow = 7;
                                break;
                        }
                        break;
                    case 7:
                        switch (whatRow[8]){
                            case 6:
                                randomRow = 8;
                                break;
                            //case two cannot exsit inside case two
                            case 8:
                                randomRow = 6;
                                break;

                        }
                        break;
                    case 8:
                        switch (whatRow[8]){
                            case 6:
                                randomRow = 7;
                                break;
                            case 7:
                                randomRow = 6;
                                break;
                        }
                        break;
                }


                randomCol = 0;
                switch (whatCol[3]){
                    case 6:
                        switch (whatCol[6]){
                            //case one cannot exsit inside case one
                            case 7:
                                randomCol = 8;
                                break;
                            case 8:
                                randomCol = 7;
                                break;
                        }
                        break;
                    case 7:
                        switch (whatCol[6]){
                            case 6:
                                randomCol = 8;
                                break;
                            //case two cannot exsit inside case two
                            case 8:
                                randomCol = 6;
                                break;

                        }
                        break;
                    case 8:
                        switch (whatCol[6]){
                            case 6:
                                randomCol = 7;
                                break;
                            case 7:
                                randomCol = 6;
                                break;
                        }
                        break;
                }
                if (puzzle[randomRow][randomCol] == 0){
                    puzzle[randomRow][randomCol] = iterationNum;
                    whatRow[9] = randomRow;
                    whatCol[9] = randomCol;
                    box = true;
                }
            }

            printArray();
            recusivePuzzle(iterationNum +=1);

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

