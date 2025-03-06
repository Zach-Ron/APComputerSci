package Q3.prog505t;

public class cow extends animal {
    private static final double MILK_PRICE_LB = 0.20;
    private double myMilk;
    public cow(String name, int weight, double milk, int corn, int hay){
        super(name, weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return myMilk * MILK_PRICE_LB - getFeedCost(cornCost, hayCost);
    }

    public double getMilk() { return myMilk; }
    public double getMilkPrice() { return MILK_PRICE_LB; }
}
