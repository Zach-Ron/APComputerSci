package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] matrix = new int[3][4];
            ArrayList<Integer> arrList = new ArrayList<>();
            ArrayList<Integer> secArrList = new ArrayList<>();
            for (int r = 0; r < matrix.length; r++) {
                System.out.println();
                for (int c = 0; c < matrix[0].length; c++) {
                    matrix[r][c] = file.nextInt();
                    System.out.print(matrix[r][c] + " ");
                }
            }

            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++)
                    if (matrix[r][c] < 100) {
                        arrList.add(r + 1);
                        secArrList.add(c + 1);
                    }
            }
            System.out.println();
            System.out.println();
            for (int t = 0; t < secArrList.size(); t++){
                System.out.print(arrList.get(t));
                System.out.print("  " + secArrList.get(t));
                System.out.println();
            }




        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
/*

100 195 182 225
83 125 235 67
129 42 100 750

2  1
2  4
3  2

 */