package Q2.MSOE20161;

import java.util.Scanner;

public class MSOE20161 {
    public static void main(String[] args){
        int h = 1;
        while (h != 0){
            String first = "";
            String next = "";
            Scanner input = new Scanner(System.in);
            first = input.next().toString();

            for (int lcv = first.length(); lcv > 0; lcv--) {
                next += (first.substring(lcv - 1, lcv)).toString();
            }
            if (next.equals(first) == false) {
                System.out.println(first + " is not a palindrome.");
            } else System.out.println(first + " is a palindrome.");
            h = input.nextInt();
        }
        System.exit(0);
        }


    }
    /*
    111111
111111 is a palindrome.
1
hii
hii is not a palindrome.
1
a
a is a palindrome.
0

Process finished with exit code 0
     */
