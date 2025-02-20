package Q3.prog702p;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class prog702p {
    public static void main(String[] args){
        Scanner file =  new Scanner(new File("Langdat/FILENAME"));
        List<Animal> list = new ArrayList();
        int type = file.nextInt();
        String name1 = file.next();
        String name2 = file.next();
            if (type == 1){
                double price = file.nextDouble();
                Animal a = new Hicca(name1, name2);
            }
            else if (type == 2){int steps = file.nextInt();}
            else if (type == 3){String word = file.next();}



    }
}
