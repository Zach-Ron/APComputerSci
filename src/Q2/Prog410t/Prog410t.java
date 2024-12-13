package Q2.Prog410t;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        Scanner file;
        int index = 0;
        String[] array = new String[25];
            try {
                if (index <= 0) {
                    file = new Scanner(new File("Langdat/survey2.dat"));
                    while (file.hasNext()) {
                        for (int next = 0; next < array.length; next++) {
                            file.nextLine();
                            String str = file.next();
                            array[next] = new String(String.valueOf(str));
                            System.out.print(array[next]);
                        }
                    }
                    index++;
                }else {
                    file = new Scanner(new File("Langdat/survey.dat"));
                    while (file.hasNext()) {
                        for (int next = 0; next < array.length; next++) {
                            file.nextLine();
                            String str = file.next();
                            array[next] = new String(String.valueOf(str));
                            System.out.print(array[next]);
                        }
                    }
                }


            } catch (
                    IOException e) {
                System.out.println("Error: " + e.getStackTrace());
            }
    }
}
