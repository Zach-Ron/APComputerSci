package Q2.prog435A;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class prog435a {
    public static void main(String[] args){
        try{
            Scanner file = new Scanner(new File("Langdat/prog435a.DAT"));
            while (file.hasNext()){
                int number = file.nextInt();
                int gate = file.nextInt();
                file.nextLine();
                new CL435(number, gate);


                //System.out.println(file.next());

            }

        }catch (IOException e){
            System.out.println("Error " + e);
        }

    }
}
