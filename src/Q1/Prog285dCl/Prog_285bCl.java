package Q1.Prog285dCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog_285bCl {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog285b.dat"));

            System.out.println("Id\tCode\tSales\tCommission");
            while (file.hasNext()){
                int id   = file.nextInt();
                int c    = file.nextInt();
                double s = file.nextDouble();

                salesPerson fred = new salesPerson(id, c,s);
                fred.setComm();
                System.out.println(fred);
            }

        } catch(IOException e)
        {
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
