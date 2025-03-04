package Q3.prog703s;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class prog703s {
    private static int amntVer = 0;
    private static int amntCol = 0;
    private static int amntCode = 0;

    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            List<computer> comp = new ArrayList<>();
            int amntMac = 0;
            int amntWin = 0;
            int amntLinux = 0;
            while (file.hasNext()) {
                int type = file.nextInt();
                String name = file.next();
                int num = file.nextInt();
                double val = file.nextDouble();

                if (type == 1) {
                    String color = file.next();
                    mac a = new mac(name, num, val, color);
                    comp.add(a);
                    checkCol(color);
                    amntMac++;
                } else if (type == 2) {
                    double ver = file.nextDouble();
                    windows c = new windows(name, num, val, ver);
                    comp.add(c);
                    checkVer(ver);
                    amntWin++;
                } else if (type == 3) {
                    int special = file.nextInt();
                    linux s = new linux(name, num, val, special);
                    comp.add(s);
                    checkCode(special);
                    amntLinux++;
                }
            }

            System.out.println("The amount of macs with Green and Gold is: " + amntCol);
            System.out.println("The amount of Windows machines on V 7.0 is: " + amntVer);
            System.out.println("The amount of Linux codes that end with 5 is: " + amntCode);

            file.close();

        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
    public static void checkVer(double v){
        if (v == 7.0){
            amntVer++;
        }
    }

    public static void checkCol(String c){
        if (c.equals("Green") || c.equals("Gold"))
            amntCol++;
    }

    public static void checkCode(int c){
        if (c % 5 == 0 && c % 10 != 0)
            amntCode++;
    }
}
