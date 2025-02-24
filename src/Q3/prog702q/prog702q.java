package Q3.prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog702q {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));


        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
