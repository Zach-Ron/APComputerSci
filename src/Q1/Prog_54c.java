package Q1;
import java.util.*;

public class Prog_54c {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("Please input radius of the circle: ");
        double Radius = input.nextDouble();
        double RadRound = Math.round(Radius * 1000.0) / 1000.0;
        double Circumference = 2 * PI * Radius;
        double CirRound = Math.round(Circumference * 1000.0) / 1000.0;
        double Area = PI * Math.pow(Radius, 2);
        double ARound = Math.round(Area * 1000.0) / 1000.0;
        System.out.println("The Radius is: " + RadRound);
        System.out.println("The Circumference is: " + CirRound);
        System.out.println("The Area is: " + ARound);
        System.out.print("Please input radius of the circle: ");

    }

}
/*
Please input radius of the circle: 3.712
The Radius is: 3.712
The Circumference is: 23.323
The Area is: 43.288
 */
