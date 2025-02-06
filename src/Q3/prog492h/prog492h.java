package Q3.prog492h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog492h {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog492hnum.DAT"));
            int[][] life = new int[file.nextInt()][file.nextInt()];
            int length = life.length;
            int wid = life[0].length;
            for(int i = 0; i < life.length; i++){
                for (int h = 0; h < life[0].length; h++){
                    life[i][h] = file.nextInt();
                }
            }
            print(life, length, wid);


        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }


    }

    public int locals(int[][] domain){
        int amnt = 0;
        for (int lcv = 0; lcv < domain.length; lcv++)
        {
            for (int wcv = 0; wcv < domain[0].length; wcv++)
                if (domain[lcv+1][wcv])
        }
    }

    public static void print(int[][] domain, int len, int width)
    {
        for (int lcv = 0; lcv < len; lcv++)
        {
            System.out.println();
            for (int wcv = 0; wcv < len; wcv++)
                if (domain[lcv][wcv] == 0) {
                    System.out.print(".");
                } else
                    System.out.print("*");
        }
    }
}
