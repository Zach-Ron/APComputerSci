package Q3.prog703s;

public class computer implements comps{
    private String name;
    private int number;
    private double value;

    public computer(String n, int num, double val){
        name = n;
        number = num;
        value = val;
    }

        public String getName(){return name;}
        public int getNumber(){return number;}
        public double getValue(){return value;}
}
