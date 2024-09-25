package Q1;
import java.util.Scanner;

public class Prog_76a {
    public static void main(String[] args){
        int str  = 1;

            do {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter an integer from 1-9 you HATE: ");
                int Hate = (Integer)in.nextInt();
                if (Hate >= 1 && Hate <= 9) {
                    System.out.println(Hate);
                    System.out.println("x 9");
                    int x9 = Hate * 9;
                    System.out.println(x9);
                    System.out.println("-------");
                    System.out.println(x9);
                    System.out.println("x " + 12345679);
                    int Product = x9 * 12345679;
                    System.out.println("Trolled!!!!! " + Product);


                    System.out.println();
                    System.out.println("Continue?  1/0 ");
                    str = in.nextInt();
                }

            }
            while (str == 1);

    }
}
/*
Enter an integer from 1-9 you HATE:
5
5
x 9
45
-------
45
x 12345679
Trolled!!!!! 555555555

Continue?  1/0
0

Process finished with exit code 0
 */