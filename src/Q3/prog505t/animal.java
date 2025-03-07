package Q3.prog505t;

public abstract class animal {
    private String myName;
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;
    public animal(String name, int weight, int corn, int hay){
        myName = name;
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
        math.findTotCorn(myNumCorn);
        math.findTotHay(myNumHayBales);
    }
    public abstract double value(double cornCost, double hayCost);
    public String getName() {return myName; }
    public int getWeight() {return myWeight; }
    public int getMyNumCorn() {return myNumCorn; }
    public int getMyNumHayBales() {return myNumHayBales; }

    public double getFeedCost(double cornCost, double hayCost) {
        return (myNumCorn * cornCost) + (myNumHayBales * hayCost);
    }
}
