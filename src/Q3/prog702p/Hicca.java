package Q3.prog702p;

public class Hicca extends Animal{
    private double price;
    private double average;
    private double addPrice = 0;
    private int add = 0;
    public Hicca(String fName, String lName, double mones){
        super(fName, lName);
        price = mones;
    }
    public void setAvg(double mones){
        addPrice += price;
        add += 1;
    }
}
