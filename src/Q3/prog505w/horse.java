package Q3.prog505w;

public class horse extends animal{
    private double myCost;
    private int myNumRides;

    public horse(String name, int weight, int corn, int hay, int rides, double cost){
        super(name, weight, corn, hay);
        myNumRides = rides;
        myCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName() { return super.getName() + super.getName();}
    public int getRides() { return myNumRides;}
    public double getRideCost() { return myCost;}
}
