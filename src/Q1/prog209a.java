package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog209a {
    public static void main(String[] args){
        int low = 0;
        int high = 0;
try{
    Scanner file = new Scanner(new File("Langdat/prog215a.dat"));

    while (file.hasNext()){

        int num = file.nextInt();
        if (num > 500) {
            high++;
        } else
            low++;
    }
    System.out.println("low: " + low);
    System.out.println("high: " + high);
}catch(IOException e){

}

    }
}
/*
low: 192
high: 208
 */