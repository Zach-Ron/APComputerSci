package Q3.prog607a;

import java.util.Scanner;

public class prog607a {
    public static void main(String[] args){
        int ben; //3 = good to go
        String date = "";
        Date.printMenu();
        Scanner funne = new Scanner(System.in);
        ben = funne.nextInt();
        while (ben != 0)
        {

                System.out.println("Enter Date (M/D/Y): ");
                date = funne.next();
                Date fun = new Date(date);

                if (ben == 1) {
                    System.out.println(fun.encode());
                }else if (ben == 2){
                    System.out.println(fun.decode());
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
