package Q3.prog702q;

public class bus extends vehicle {
    private String city;
    public bus(String n, int tires, String c){
        super(n, tires);
        city = c;
   }

   public String getCity(){
       return city;
   }

}
