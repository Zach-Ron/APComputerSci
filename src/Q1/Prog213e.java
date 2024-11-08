package Q1;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog213e {
    public static void main(String[] args){
        int dist = 0;
        int dist2 = 0;
        int dist3 = 0;
        int dist4 = 0;
        int dist5 = 0;

        double percent = 0;

        try {
            Scanner file = new Scanner(new File("Langdat/prog213e.dat"));
            while (file.hasNext()){
                if (file.nextInt() < 20) {
                    dist++;
                } else if (file.nextInt() >= 20 && file.nextInt() <= 39) {
                    dist2++;
                } else if (file.nextInt() >= 40 && file.nextInt() <= 59) {
                    dist3++;
                } else if (file.nextInt() >= 60 && file.nextInt() <= 79) {
                    dist4++;
                } else
                    dist5++;
            }
            }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());

        }
for (int place = 5; place > 0; place--){
    if (place == 5){
        percent = 100 * (dist / (dist + dist2 + dist3 + dist4 + dist5));
    }else if (place == 4){
        percent = 100 * (dist2 / (dist + dist2 + dist3 + dist4 + dist5));
    }else if (place == 3) {
        percent = 100 * (dist3 / (dist + dist2 + dist3 + dist4 + dist5));
    }else if (place == 2) {
        percent = 100 * (dist4 / (dist + dist2 + dist3 + dist4 + dist5));
    }else if (place == 1) {
        percent = 100 * (dist5 / (dist + dist2 + dist3 + dist4 + dist5));
    }
    System.out.println(percent);
}


    }
}
