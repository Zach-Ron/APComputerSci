package Q2.prog602B;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class prog602B {
    public static void main(String[] args){
        try{
            Scanner file = new Scanner(new File("Langdat/prog602b.dat"));
            ArrayList<internetCustomer> list = new ArrayList<internetCustomer>();
            while (file.hasNext()){
                int id = file.nextInt();
                double hours = file.nextDouble();
                int code = file.nextInt();

                internetCustomer fred = new internetCustomer(id, hours, code);
                list.add(fred);

            }
            for (int lcv = 0; lcv < list.size(); lcv++){
                internetCustomer me = list.get(lcv);
                me.setCharge();
            }

            System.out.println("Account #\tHours\t\tCode\t\tAmount Due");
            for (internetCustomer me : list)
                System.out.printf("%d\t\t%.2f\t\t%d\t\t\t$%.2f\n",
            me.getAcc(), me.getHours(), me.getCode(), me.getCharge());
        } catch (IOException e){

        }
    }
}
