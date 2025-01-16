package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog464d {
    /**
     * Performs matrix transposition on 2d array of ints
     * @param mat 2d array to be transposed
     * @return    transposition of 'mat'
     */
    public static int[][] transpose(int[][] mat){
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++)
            for (int col = 0; col < mat[0].length; col++)
                transposed[col][row] = mat[row][col];
        return transposed;
    }
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for(int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = file.nextInt();

            int[][] mat_T = transpose(mat);

            System.out.println("OG matrix");
            for(int[] row : mat){
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }

            System.out.println("\nTransposed matrix");
            for(int r = 0; r < mat_T.length; r++) {
                for (int c = 0; c < mat_T[0].length; c++)

                    System.out.print(mat_T[r][c] + " ");
                System.out.println();
            }
        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
