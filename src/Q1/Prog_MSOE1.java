package Q1;
import java.util.Scanner;

public class Prog_MSOE1 {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word");
        String word = kbd.nextLine();
        word = word.toLowerCase();
        int dblcnt = 0;

        for (int lcv = 0; lcv < word.length() - 1; lcv++){
            String cLetter = word.substring(lcv, lcv+1);
            String nLetter = word.substring(lcv+1, lcv+2);
            if (cLetter.equals(nLetter))
                dblcnt++;
        }
        System.out.printf("%s contains %d double letters\n", word, dblcnt);

    }
}
