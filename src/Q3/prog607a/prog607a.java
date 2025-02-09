package Q3.prog607a;

import java.util.Scanner;

public class prog607a {
    public static void main(String[] args){
        int ben; //3 = good to go
        String date = "";
        cl607a.printMenu();
        Scanner funne = new Scanner(System.in);
        ben = funne.nextInt();
        while (ben != 0)
        {

                System.out.println("Enter Date (M/D/Y): ");
                date = funne.next();

                if (ben == 1) {
                    date.encode();
                }

                Date.printMenu();
                if (funne.nextInt() < 3 && funne.nextInt() >= 0) {
                    ben = funne.nextInt();
                } else {
                    System.out.println("Invalid input, try again.");
                }
        }
        funne.close();
        System.exit(1);



    }
}
