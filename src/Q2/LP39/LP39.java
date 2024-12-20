package Q2.LP39;

import java.util.Scanner;

public class LP39 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What year were you born?");
            int year1 = scanner.nextInt();
            System.out.println("What month were you born?");
            int month1 = scanner.nextInt();
            System.out.println("What day were you born?");
            int day1 = scanner.nextInt();
            System.out.println("What year is it?");
            int year2 = scanner.nextInt();
            System.out.println("What month is it?");
            int month2 = scanner.nextInt();
            System.out.println("What day is it?");
            int day2 = scanner.nextInt();
            System.out.println("How many hours do you sleep on average?");
            double length = scanner.nextDouble();
            CLLP39 time = new CLLP39(year1, month1, day1, year2, month2, day2, length);


    }
}
