package Q1;

public class Prog_122a {
    public static void main(String[] args){
        double sqr = 0;
        int square = 0;
        for (int place = 1; place <= 50; place++){
            sqr = Math.sqrt(place);
            square = place * place;
            System.out.printf((int)place +"  " + square +"  %.2f\n", sqr);
        }
    }
}
