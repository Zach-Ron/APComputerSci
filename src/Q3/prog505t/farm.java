package Q3.prog505t;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class farm implements IFarm{
    private ArrayList<horse> myHorses;
    private ArrayList<cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public static void main(String[] args) {
        try{
            Scanner file = new Scanner(new File("Langdat/prog505t.dat"));
            List<animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();
            int cumulativeWeight = 0;

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();

            for (int r = 0; r < cowRows; r++){
                for (int p = 0; p < cowPens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    cumulativeWeight += weight;
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
                    cumulativeWeight += weight;
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
                    horse horse = (Q3.prog505t.horse) animals.get(lcv);
                    double horseVal = horse.value(cornCost, hayCost);
                    if (horseVal < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseVal;
                    }
                }
            }
            System.out.printf("Horse " + minHorseIndex + "  the least money\n");
            animals.get(minHorseIndex).getName();
            System.out.println("");

            int maxCowIndex = 0;
            double maxCowValue = Double.MIN_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++){
                if (animals.get(lcv) instanceof cow) {
                    cow cow = (Q3.prog505t.cow) animals.get(lcv);
                    double cowVal = cow.value(cornCost, hayCost);
                    if (cowVal > maxCowValue) {
                        maxCowIndex = lcv;
                        maxCowValue = cowVal;
                    }
                }
            }


            System.out.printf("Cow " + maxCowIndex + "  the most money\n");




        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }

    private boolean feedCows(int nCorn, int nHay) {
        if (math.getCowCorn() < nCorn || math.getCowHay() < nHay){
            return true;
        }
        else return false; }

    private boolean feedHorses(int nCorn, int nHay)  {
        if (math.getHorsesCorn() < nCorn || math.getHorsesHay() < nHay){
            return true;
        }
        else return false; }

    public boolean feedAllAnimals(int nCorn, int nHay){
        if (math.getTotHay() < nHay || math.getTotCorn() < nCorn){
            return true;
        }
        else return false;
    }

    private double cowIncome(double perPound)  { return 0; }

    private double horseIncome() { return 0; }

    public double farmIncome(){

    }

    public int getWeight(){

    }

    public double getCost(){

    }

    public ArrayList<cow> getCows(){

    }

    public ArrayList<horse> getHorses(){

    }

}
