package Q2;
import java.util.Scanner;


public class MSOE_2016_2 {
    public static void main(String[] args){
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        double angA = 0;
        double angB = 0;
        double angC = 0;
        double math = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Length of side A: ");
        sideA = input.nextDouble();
        System.out.println("Length of side C: ");
        sideC = input.nextDouble();
        System.out.println("Angle measure of A: ");
        angA = input.nextDouble();
        math = (Math.sin(angA) / sideA) * sideC;
        angC = Math.asin(math);
        System.out.println(angC);

    }
}
