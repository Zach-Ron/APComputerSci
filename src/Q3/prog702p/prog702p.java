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


            for (Animal a : list){
                if (a instanceof Hicca){
                    double price = ((Hicca) a).getPrice();
                    System.out.println("Hicca: ");
                    System.out.println();
                }
            }

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
