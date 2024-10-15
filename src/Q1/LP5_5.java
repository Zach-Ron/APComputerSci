package Q1;
import java.util.*;

public class LP5_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        String num = input.next();

        int len = num.length();

        for (int h = 0; h < len; h++ ){
            System.out.println(num.charAt(h));
        }

    }

}
