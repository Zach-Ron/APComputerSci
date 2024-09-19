package Q1;
import java.util.*;

public class Prog_54b {
    public static void main(String[] Args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a 3 digit number: ");

        int Num1 = Input.nextInt();
        System.out.print("Please enter a 3 digit number: ");
        int Num2 = Input.nextInt();
        System.out.print("Please enter a 3 digit number: ");
        int Num3 = Input.nextInt();
        System.out.print("Please enter a 3 digit number: ");
        int Num4 = Input.nextInt();
        int Sum = Num1 + Num2 + Num3 + Num4;
        double Avg = (double)Sum / 4;
        System.out.println("Sum of all numbers is: " + Sum + " The Avg of all numbers is: " + Avg);
    }

}
/*
Please enter a 3 digit number: 575
Please enter a 3 digit number: 575
Please enter a 3 digit number: 575
Please enter a 3 digit number: 575
Sum of all numbers is: 2300 The Avg of all numbers is: 575.0
 */
