package Q3.prog702q;

public class vehicle implements names {
    private String name;
    private int amntTires;
    private double price;
    public vehicle(String n, int tires){
        name = n;
        amntTires = tires;
    }
public String getNames(){
return name;
        }
public int getTire(){
return amntTires;
        }
public double getValue(){
return price;
        }
}
