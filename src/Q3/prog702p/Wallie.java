package Q3.prog702p;

public class Wallie extends Animal{
    private int takenSteps;
    private double avgSteps;
    private int totSteps = 0;
    private int amtWallie = 0;

    public Wallie(String fName, String lName, int steps){
        super(fName, lName);
        amtWallie++;
        takenSteps = steps;
        totSteps += steps;
        setAvg();
    }

    public void setAvg(){
        avgSteps = totSteps / amtWallie;
    }

    public double getAvg(){
        return avgSteps;
    }

}
