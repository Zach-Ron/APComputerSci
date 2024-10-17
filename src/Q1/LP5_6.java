package Q1;
import java.util.*;

public class LP5_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        int number = input.nextInt();
        String strnum = Integer.toString(number);
        int pain = number % 10;
        int hate = number / 10;
        int math = pain * (hate % 10);

        for (int time = (strnum.length() - 2); time > 0; time--){
            hate /= 10;
            pain = hate % 10;
            math *= pain;

        }

        System.out.println(math);

    }
}
/*
Enter a non-negative integer: 222
8

Process finished with exit code 0
 */
