package Q1.Prog_52aCl;
import java.util.Scanner;

public class Prog52aCl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();


        Cl52a wow = new Cl52a(l, w);
        wow.calc();

        int area = wow.getArea();
        int perim = wow.getPerim();


        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perim: " + perim);
    }
}
