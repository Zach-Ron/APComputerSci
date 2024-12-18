package Q2.prog435A;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class prog435a {
    public static void main(String[] args){
        System.out.println("Car Type\t\t\tBase Toll\t\t\tFactor\t\t\tCost");
        try{
            Scanner file = new Scanner(new File("Langdat/prog435a.DAT"));
            while (file.hasNext()){
                int number = file.nextInt();
                int gate = file.nextInt();
                new CL435(number, gate);
                System.out.println(cl435.getCar() + "\t\t\t" + cl435.getRate() +"\t\t\t  " + cl435.getFactor()
                + "\t\t\t  " + cl435.getTotal());


                //System.out.println(file.next());

            }

        }catch (IOException e){
            System.out.println("Error " + e);
        }

    }
}
