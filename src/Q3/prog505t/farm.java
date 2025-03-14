package Q3.prog505t;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class farm /*implements IFarm*/{
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
            double feedCost = 0;

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();

            for (int r = 0; r < cowRows; r++){
                for (int p = 0; p < cowPens; p++){
                    String name = file.next();
                    int weight = file.nextInt();
                    cumulativeWeight += weight;
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    math.findTotHay(hayEaten);
                    int cornEaten = file.nextInt();
                    math.findTotCorn(cornEaten);
                    cow wow = new cow(name, weight, milk,cornEaten, hayEaten);
                    animals.add(wow);
                    feedCost += (hayEaten * hayCost) + (cornEaten * cornCost);
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
                    math.findTotHay(hayEaten);
                    int cornEaten = file.nextInt();
                    math.findTotCorn(cornEaten);
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    horse fred = new horse(name, weight,cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                   
                    feedCost += (hayEaten * hayCost) + (cornEaten * cornCost);
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



            System.out.println("Income Today: " );
            System.out.println("The cost of feeding the animals is: " + feedCost);
            System.out.println("All weight together: " + cumulativeWeight);
            if (feedAllAnimals(corn, hay)){
                corn -= math.getTotCorn();
                hay -= math.getTotHay();
                System.out.println("The remaining corn after feed is: " + corn);
                System.out.println("The remaining hay after feed is: " + hay);
            } else System.out.println("Cannot feed animals, not enough food!");







        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }

    private static boolean feedCows(int nCorn, int nHay) {
        if (math.getCowCorn() < nCorn || math.getCowHay() < nHay){
            return true;
        }
        else return false; }

    private static boolean feedHorses(int nCorn, int nHay)  {
        if (math.getHorsesCorn() < nCorn || math.getHorsesHay() < nHay){
            return true;
        }
        else return false; }

    public static boolean feedAllAnimals(int nCorn, int nHay){
        if (math.getTotHay() < nHay || math.getTotCorn() < nCorn){
            return true;
        }
        else return false;
    }

    private double cowIncome(double perPound)  {
        double income = 0;
        return 0; }

    private double horseIncome() {
        double income = 0;

        return 0; }

 /*   public double farmIncome(){
        double income = 0;

    }

    public int getWeight(){

    }

    public double getCost(){

    }

    public ArrayList<cow> getCows(){

    }

    public ArrayList<horse> getHorses(){

    }
*/
}
