package Q3.prog702p;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class prog702p {
    public static void main(String[] args){
        try {


            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            List<Animal> list = new ArrayList();
            do {
                int type = file.nextInt();
                String name1 = file.next();
                String name2 = file.next();
                if (type == 1) {
                    double price = file.nextDouble();
                    Animal a = new Hicca(name1, name2, price);
                    list.add(a);
                } else if (type == 2) {
                    int steps = file.nextInt();
                    Animal a = new Wallie(name1, name2, steps);
                    list.add(a);
                } else if (type == 3) {
                    String word = file.next();
                    Animal a = new Beeper(name1, name2, word);
                    list.add(a);
                }
            } while (file.hasNext());

            file.close();

            int amnt = 0;

            for (Animal a : list){
                if (a instanceof Hicca){
                    amnt++;
                    System.out.println(((Hicca) a).getName());
                    System.out.println("Hicca ");
                    System.out.println(((Hicca) a).getPrice());
                    System.out.println();
                }else if (a instanceof Wallie){
                    amnt++;
                    System.out.println(((Wallie) a).getName());
                    System.out.println("Wallie ");
                    System.out.println(((Wallie) a).getSteps());
                    System.out.println();
                }else if (a instanceof Beeper){
                    amnt++;
                    System.out.println(((Beeper) a).getName());
                    System.out.println("Beeper ");
                    System.out.println(((Beeper) a).getWord());
                    System.out.println();
                }
            }

            System.out.println("Total number of Hiccas:" + ((Hicca) list).hiccas());
            System.out.println("Total number of Wallies:" + ((Wallie) list).wallies());
            System.out.println("Total number of Beepers:" + ((Beeper) list).beepers());
            System.out.println("Total number of animals: " + amnt);
            System.out.println();
            System.out.println("Average price of Hicca coats: " + ((Hicca) list).getAvg());
            System.out.println("Average steps taken by Wallies: " + ((Wallie) list).getAvg());
            System.out.println("Average length of Beeper words: " + ((Beeper) list).getAvg());


        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
