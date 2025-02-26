package Q3.prog702q;

public class vehicle implements names {
    private String name;
    private int amntTires;
    private double price;
    public vehicle(String n, int tires, double p){
        name = n;
        amntTires = tires;
        price = p;
    }
public String getName(){
return name;
        }
public int getTire(){
return amntTires;
        }
public double getValue(){
return price;
        }
}
