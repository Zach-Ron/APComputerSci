package Q3.prog505w;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class farm {
    public static void main(String[] args) {
        try{
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();

            for (int r = 0; r < cowRows; r++){
                for (int p = 0; p < cowPens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    cow wow = new cow(name, weight, milk,cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();

            for (int r = 0; r < horseRows; r++){
                for (int p = 0; p < horsePens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    horse fred = new horse(name, weight,cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for(int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof horse) {
                    horse horse = (horse) animals.get(lcv);
                    double horseVal = horse.value(cornCost, hayCost);
                    if (horseVal < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseVal;
                    }
                }
            }
            System.out.printf("Horse s makes the least money\n");
            animals.get(minHorseIndex).getName();


        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
