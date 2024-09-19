package Q1;
import java.util.*;

public class Prog_58h {
    public static void main(String[] args){
        int str  = 1;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please input amount saved: ");
            double amtSaved = input.nextDouble();
            System.out.println("Insert interest rate: ");
            double Interest = .01 * input.nextDouble();
            System.out.println("Insert times compounded: ");
            double Compound = input.nextDouble();
            System.out.println("Insert number of days: ");
            int Days = input.nextInt();
           double power = (Compound * Days) / 365 ;

            double Bal = Math.round(amtSaved * Math.pow((1 + (Interest / Compound)),power) * 100.0) / 100.0;
            double Earned = Bal - amtSaved;

                    System.out.println("The interest earned: " +Earned);
                    System.out.println("The total balance is: " +Bal);


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
Please input amount saved:
5000
Insert interest rate:
11.5
Insert times compounded:
365
Insert number of days:
900
The interest earned: 1638.96
The total balance is: 6638.96
Continue?    1/0 1
Please input amount saved:
10000
Insert interest rate:
16.5
Insert times compounded:
365
Insert number of days:
90
The interest earned: 415.1399999999994
The total balance is: 10415.14
Continue?    1/0 1
Please input amount saved:
1500
Insert interest rate:
8.5
Insert times compounded:
365
Insert number of days:
365
The interest earned: 133.05999999999995
The total balance is: 1633.06
Continue?    1/0 0

Process finished with exit code 1

 */