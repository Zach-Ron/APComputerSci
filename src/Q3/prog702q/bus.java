package Q3.prog702q;

public class bus extends vehicle {
    private String city;
    public bus(String n, int tires, String c, double p){
        super(n, tires, p);
        city = c;
   }

   public String getCity(){
       return city;
   }

}
