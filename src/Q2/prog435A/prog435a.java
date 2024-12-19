package Q2.prog435A;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class prog435a {
    public static void main(String[] args){

        System.out.println("Car Type\t\t\tBase Toll\t\t\tFactor\t\t\tCost");
        System.out.println();
        try{
            Scanner file = new Scanner(new File("Langdat/prog435a.DAT"));
            while (file.hasNext()){
                int number = file.nextInt();
                int gate = file.nextInt();
                CL435 cl435 = new CL435(number, gate);
                cl435.setRate();
                cl435.setVehicleFactor();
                cl435.setTotal();
                System.out.println(cl435.getCar() + "\t\t" + cl435.getRate() +"\t\t\t\t" + cl435.getFactor()
                + "\t\t\t\t" + cl435.getTotal());


                //System.out.println(file.next());

            }

        }catch (IOException e){
            System.out.println("Error " + e);
        }

    }
}
/*
Car Type			Base Toll			Factor			Cost

Compact Car			1.35				1.0				1.35
Small Car  			2.50				1.3				3.25
Mid Size Car		4.10				1.6				6.56
Full Size Car		5.50				2.0				11.0
Truck				2.00				2.4				4.8
16 Wheeler			3.25				2.7				8.78
Compact Car			4.80				1.0				4.8
Small Car  			6.00				1.3				7.8
Mid Size Car		1.35				1.6				2.16
Full Size Car		2.50				2.0				5.0
Truck				4.10				2.4				9.84
16 Wheeler			5.50				2.7				14.85
Compact Car			6.00				1.0				6.0
Small Car  			1.35				1.3				1.76
Mid Size Car		2.00				1.6				3.2
Full Size Car		2.50				2.0				5.0
Truck				3.25				2.4				7.8
16 Wheeler			4.10				2.7				11.07

Process finished with exit code 0
 */
