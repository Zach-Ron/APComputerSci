package Q1;
import java.util.*;

public class prog_58t {
    public static void main(String[] args){
        int str  = 1;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Amount owed: ");
            double owed = input.nextDouble();
            System.out.println("Amount received: ");
            double given = input.nextDouble();
            double change = (given - owed) * 100.00;
           change = Math.round(change);
           change = change / 100.00;

                int dollars = (int) (change / 1.00);
                double remaining = change - dollars;
                int quarters = (int)(remaining / .25);
                remaining = remaining - (quarters * .25);
                int dimes = (int)(remaining / .10);
                remaining = remaining - (dimes * .10);
                int nickels = (int)(remaining / .05);
                remaining = remaining - (nickels * .05);
                int pennies = (int)(remaining / .01 + .01);
            System.out.println("Given: " + given);
            System.out.println("Owed: " + owed);
                System.out.println("Change: " + change);
                System.out.println("Dollars: " + dollars);
                System.out.println("Quarters: " + quarters);
                System.out.println("Dimes: " + dimes);
                System.out.println("Nickels: " + nickels);
                System.out.println("Pennies: " + pennies);


            System.out.print("Continue?    1/0 ");
            str = input.nextInt();
        }
        while (str == 1);
        {
            System.exit(1);
        }

    }
}
/*
Amount owed:
125.32
Amount received:
140
Given: 140.0
Owed: 125.32
Change: 14.68
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
Continue?    1/0 0

Process finished with exit code 1
 */