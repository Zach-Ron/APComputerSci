package Q1;

public class Prog_122a {
    public static void main(String[] args){
        double sqr = 0;
        double square = 0;
        for (double place = 1; place <= 50; place++){
            sqr = Math.sqrt(place + 2);
            square = place * place;
            System.out.println((int)place +"  " + square +"  "+ sqr);
        }
    }
}
