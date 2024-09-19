package Q1;
import java.util.*;

public class prog_93a {
    public static void main(String[] args){
        int str  = 1;
        final double CpKH = .04750;
       final double sur = .10;
        final double util = .030;
        final double late = .040;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("KwH used: ");
            int KwH = in.nextInt();
            double Base = (KwH * CpKH);
            Base = Base * 100.00;
            Base = Math.round(Base);
            Base = Base / 100.00;
            double charge = Base * sur;
            double tax = Base * util;
            double tot = Base + charge + tax;
            double latefee = tot + (tot * late);
            System.out.println("KwH: " + KwH + " hours         Base Price: $" + Base);
            System.out.printf("Surcharge: $%.2f\n",charge);
            System.out.printf("Utility Fee: $%.2f\n",tax);

            System.out.printf("Late Fee Total: $%.2f\n",latefee);

            System.out.println();
            System.out.println("Continue?  1/0 ");
            str = in.nextInt();

        }
        while (str == 1);
    }
}
/*
KwH used:
993
KwH: 993 hours         Base Price: $47.17
Surcharge: $4.72
Utility Fee: $1.42
Late Fee Total: $55.43

Continue?  1/0
0

Process finished with exit code 0
 */
