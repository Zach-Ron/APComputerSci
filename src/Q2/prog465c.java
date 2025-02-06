package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465c {
    //Write a program that reads 2 numbers which determines the size of a matrix.
    // Then, read in the matrix.
    // The program should then add all of the numbers oround the outside edge and print both the matrix and the answer.

    //	100	195	182	225
    //	83	125	235	67
    //	129	42	100	750


    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));
            int[][] matrix = new int[file.nextInt()][file.nextInt()];
            for(int r = 0; r < matrix.length; r++)
                for(int c = 0; c < matrix[0].length; c++)
                {
                    matrix[r][c] = file.nextInt();
                }


        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }

    }
}
