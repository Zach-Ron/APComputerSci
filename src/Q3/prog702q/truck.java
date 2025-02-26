package Q3.prog702q;

public class truck extends vehicle{
    private double price;
    private int milesDriven;
    public truck(String n, int tires, int miles, double p){
        super(n, tires, p);
        milesDriven = miles;
        price = p - (milesDriven * .25);
    }

}
