package Q3.prog703s;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class prog703s {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.dat"));
            List<computer> comp = new ArrayList<>();

            while (file.hasNext()){
                int type = file.nextInt();
                String name = file.next();
                int num = file.nextInt();
                double val = file.nextDouble();
                if(type == 1){

                }
                else if (type == 2){
                    double ver = file.nextDouble();
                    windows c = new windows(name, num, val, ver);

                }
            }

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
