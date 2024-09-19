package Q1;
import com.sun.source.tree.IfTree;

import java.util.*;

public class Prog_58b {
    public static void main(String[] args){
         int str  = 1;

        do {

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter an Integer: ");
            int Int1 = input.nextInt();
            System.out.print("Please enter an Integer: ");
            int Int2 = input.nextInt();
            System.out.print("Please enter an Integer: ");
            int Int3 = input.nextInt();
            double Sqr1 = (-Int2 + Math.sqrt((((double)Int2 * Int2) - (4 * (double)Int1 * Int3)))) / (2 * (double)Int1);
            double Sqr2 = (-Int2 - Math.sqrt((((double)Int2 * Int2) - (4 * (double)Int1 * Int3)))) / (2 * (double)Int1);
            System.out.println("The roots are: " + Sqr1 +" and " + Sqr2);
            System.out.println();

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
Please enter an Integer: 1
Please enter an Integer: 5
Please enter an Integer: 6
The roots are: -2.0 and -3.0

Continue?    1/0 1
Please enter an Integer: 1
Please enter an Integer: 1
Please enter an Integer: -2
The roots are: 1.0 and -2.0

Continue?    1/0 1
Please enter an Integer: 1
Please enter an Integer: 1
Please enter an Integer: -6
The roots are: 2.0 and -3.0

Continue?    1/0 0

Process finished with exit code 1
 */