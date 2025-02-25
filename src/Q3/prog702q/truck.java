package Q3.prog702q;

public class truck extends vehicle{
    private double price;
    private int milesDriven;
    public truck(String n, int tires, int miles){
        super(n,tires);
        milesDriven = miles;
        price = 50000 - (milesDriven * .25);
    }
}
