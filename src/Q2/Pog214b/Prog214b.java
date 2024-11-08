package Q2.Pog214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args){

        int numE = 0;
        try {
            Employee(numE);
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));
            while (file.hasNext()){


            }

        } catch(IOException e)
        {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
