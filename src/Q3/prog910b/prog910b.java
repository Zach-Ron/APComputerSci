package Q3.prog910b;

import java.util.Scanner;

public class prog910b {
    public static void main(String[] args){
        int ben = 0;
        int n1 = 0;
        int n2 = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Number: ");
            n1 = input.nextInt();
            System.out.println("Base: ");
            n2 = input.nextInt();
            CL_910b.Calc(n1, n2);
                System.out.println(CL_910b.getCalc());

    }

    public void uiCall(){

    }
}
