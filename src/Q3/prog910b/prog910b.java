package Q3.prog910b;

import java.util.Scanner;

public class prog910b {
    public static void main(String[] args){
        int ben = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Number: ");
            CL_910b.setNum(input.nextInt());
            System.out.println("Base: ");
            CL_910b.setBase(input.nextInt());
            while (ben != -1){
                System.out.println(CL_910b.Calc());
            }
    }

    public void uiCall(){

    }
}
