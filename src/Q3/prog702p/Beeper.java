package Q3.prog702p;

public class Beeper extends Animal {
    private String what;
    private double avgLength;
    private int lenWord = 0;
    private int amtBeeper = 0;
    public Beeper(String fName, String lName, String word){
        super(fName, lName);
        what = word;
        amtBeeper++;
        lenWord += what.length();
        setAvg();
    }

    public void setAvg(){
        avgLength = lenWord / amtBeeper;
    }

    public double getAvg(){
        return avgLength;
    }

    public int beepers(){
        return amtBeeper;
    }
}
