package Q1;
import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    int yn = 1;

    do {
        System.out.println("State the amount of copies you wish to receive ");
        int Size = input.nextInt();
        double price = 0;

        if (Size <= 99 & Size > 0) {
            price = Size * .30;

        } else if (Size <= 499 & Size > 99) {
            price = Size * .28;

        } else if (Size > 499 & Size <= 749) {
            price = Size * .27;

        } else if (Size > 749 & Size <= 1000) {
            price = Size * .26;

        } else if (Size > 1000) {
            price = Size * .25;

        } else {
            price = 0;
        }
        System.out.printf("The cost is: $%.2f\n", price);

        System.out.println();
        System.out.println();
        System.out.println("Continue?   1/0");
        yn = input.nextInt();
    } while (yn ==1);

    System.exit(0);
    }

}
/*
1
State the amount of copies you wish to receive
1001
The cost is: $250.25


Continue?   1/0
1
State the amount of copies you wish to receive
99
The cost is: $29.7


Continue?   1/0
1
State the amount of copies you wish to receive
0
The cost is: $0.0


Continue?   1/0
1
State the amount of copies you wish to receive
101
The cost is: $28.28


Continue?   1/0
0

Process finished with exit code 0
 */