package Q3.prog701g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class prog701g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            List<person> list = new ArrayList<person>();

            int num = file.nextInt();

            while (num != 99){
                String f = file.next();
                String l = file.next();

                if (num == 1) {
                    double gpa = file.nextDouble();
                    person p = new student (f, l, gpa);
                    list.add(p);
                } else if (num == 2) {
                    int ns = file.nextInt();
                    person p = new teacher(f, l, ns);
                    list.add(p);
                } else if (num == 3){
                    String fw = file.next();
                    person p = new admin(f, l, fw);
                    list.add(p);
                }
                num = file.nextInt();
            }

            double tot = 0;
            int cnt = 0;
            int totStus = 0;
            String large = "";
            String small ="bsahdbfuewyhfnSJAfrvgybuhjkjhgfdyhujolikujhygtfreryujikuytredwsqzxbgipokmhycdxefdbxzgzerhfkpgfjstjnfxerz";


            for (person p : list) {
                   if (p instanceof student) {
                       tot += ((student) p).getGPA();
                       cnt++;
                   } else if (p instanceof teacher) {
                       totStus += ((teacher) p).getNumStuds();
                   } else if (p instanceof admin) {
                       String word = ((admin) p).getFavw();
                       if (word.length() > large.length())
                           large = word;
                       if (word.length() < small.length())
                           small = word;
                   }
            }

            System.out.printf("Average student GPA: %.2f\n", tot/cnt);
            System.out.println("Total number of students: " + totStus);
            System.out.println("Smallest favorite admin word: " + small);
            System.out.println("Largest favorite admin word: " + large);

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }

    }
}
