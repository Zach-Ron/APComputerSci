package Q1;
import java.util.*;
public class Prog_52A_input {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter length: ");
             int len = input.nextInt();
             System.out.println();

             System.out.print("Please enter width: ");
             int width = input.nextInt();
             System.out.println();
             int area = len * width;
             int volume = len*2 + width*2;
             System.out.println("Area = " + area);
             System.out.println("Volume = " + volume);
  }
}
/*
Please enter length: 5

Please enter width: 10

Area = 50
Volume = 30

Process finished with exit code 0
 */
