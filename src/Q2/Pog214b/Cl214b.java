package Q2.Pog214b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Cl214b {



    public Cl214b()
    {




    }
    public static int Employee(int employee)
    {
        int emp = 0;
        double payToDate = 0;

        try {
           int employeeAmt = 7;

            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));
            while (file.hasNext()) {
            for (int i = 0; i <= employeeAmt; i++) {
                for (int b = 0; b <= 4; b++){
                    if (b == 1)
                    {
                        payToDate = file.nextInt();
                    } else if (b == 2)
                    {

                    }
                }
                emp = file.nextInt();
            }
            }
        } catch(IOException e)
        {
            System.out.println("Error: " + e.getStackTrace());
        }
        return emp;
    }

}
