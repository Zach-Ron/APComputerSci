package Q3.prog702p;

public class Hicca extends Animal{
    private double price;
    private double average;
    private double addPrice = 0;
    private int add = 0;
    public Hicca(String fName, String lName, double mones){
        super(fName, lName);
        price = mones;
        add++;
        addPrice += price;
        setAvg();
    }
    public void setAvg(){
        average = addPrice / add;
    }
    public double getAvg(){
        return average;
    }

    public double getPrice(){
        return price;
    }
}
