package Q1;
import java.util.Scanner;

public class LP4_2 {
    public static void main(String[] args){

        int weight = 0;
        int length = 0;
        int width = 0;
        int height = 0;
        int size = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        weight = input.nextInt();
        System.out.println("Enter length in cm: ");
        length = input.nextInt();
        System.out.println("Enter width in cm: ");
        width = input.nextInt();
        System.out.println("Enter height in cm: ");
        height = input.nextInt();
        size = length * width * height;

        if (size > 100000 && weight > 27){
        System.out.println("Package is both too heavy and too large.");
            }else if (size > 100000 && weight <= 27){
            System.out.println("Package is too large.");
        }else if (size < 100000 && weight > 27){
            System.out.println("Package is too heavy.");
        }else{
            System.out.println("order set");
        }
    }
}
