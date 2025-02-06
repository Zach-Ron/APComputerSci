package Q3.prog477a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] array = new int[5][3];
            for (int i = 0; i < array.length; i++)
                for (int h = 0; h < array[0].length-1; h++)
                {
                    array[i][h] = file.nextInt();
                }
            for (int i = 0; i < array.length; i++)
                for (int h = 0; h < array[0].length-1; h++)
                {

                }

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
