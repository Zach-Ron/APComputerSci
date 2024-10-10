package Q1;
import java.util.Scanner;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = wow.nextLine().toLowerCase().trim();

        int count = 0;

        for (int lcv = 0; lcv < (text.length() * 2); lcv++){
            for (int lcv2 = lcv+1; lcv2 < (text.length() * 2); lcv2++) {
                String char1 = text.substring(lcv, lcv + 1);
                String char2 = text.substring(lcv2, lcv2 + 1);
                if (char1.equals(char2)){
                    count += 0;
                }else {
                    count ++;
                }
                break;
            }
            System.out.println(count);
        }
    }
}
