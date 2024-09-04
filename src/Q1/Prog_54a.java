package Q1;
import java.util.*;

public class Prog_54a {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Please enter car model: ");
        String model = Input.nextLine();

        System.out.print("Please enter miles driven: ");
        int miles = Input.nextInt();
        System.out.print("Please enter gallons used: ");
        int gallons = Input.nextInt();
        double mpg = (double)miles / (double)gallons;
                System.out.println("Miles per gallon used by " + model +" is " + mpg + " m/g");

    }
}
/*
Please enter car model: car
Please enter miles driven: 753
Please enter gallons used: 78
Miles per gallon used by car is 9.653846153846153 m/g
 */