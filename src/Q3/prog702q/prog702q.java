package Q3.prog702q;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class prog702q {
    public static void main(String[] args){
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));
            List<vehicle> tech = new ArrayList<>();
            int cnt = 0;
            while (file.hasNext()) {
                int h = file.nextInt();
                if (h == 1) {
                    String name = file.next();
                    int tires = file.nextInt();
                    double price = file.nextDouble();
                    vehicle c = new car(name, tires, price);
                    tech.add(c);
                    cnt++;
                } else if (h == 2) {
                    String name = file.next();
                    int tires = file.nextInt();
                    int miles = file.nextInt();
                    vehicle t = new truck(name, tires, miles, 50000);
                    tech.add(t);
                    cnt++;
                } else if (h == 3) {
                    String name = file.next();
                    int tires = file.nextInt();
                    String city = file.next();
                    vehicle b = new bus(name, tires, city, 50000);
                    tech.add(b);
                    cnt++;
                }
            }

            double totPriceCars = 0;
            double totPrice = 0;
            int amntCarTires = 0;
            int amntTruckTires = 0;
            int amntBusTires = 0;
            int nameLength = 0;

            for (vehicle v : tech){
                if (v instanceof car){
                    totPriceCars += ((car) v).getValue();
                    amntCarTires += ((car) v).getTire();
                }
            }

            for (vehicle v : tech){
                    totPrice += (v).getValue();
            }

            String longName = "";

            for (vehicle v : tech){
                if (v instanceof bus){
                    ((bus)v).getCity();
                    if (((bus)v).getCity().length() > nameLength);{
                        longName = ((bus)v).getCity();
                    }
                    amntBusTires += ((bus)v).getTire();
                    }
                }

                String cheapoTruck = "";
                double price = Double.MAX_VALUE;

            for (vehicle v : tech){
                if (v instanceof truck){
                    if (((truck)v).getValue() < price){
                        price = ((truck)v).getValue();
                        cheapoTruck = ((truck)v).getName();
                    }
                    amntTruckTires += ((truck)v).getTire();
                }
            }


            System.out.println("Total number of vehicles: " + cnt);
            System.out.println("Total price of cars: " + totPriceCars);
            System.out.println("Total price of all vehicles: " + totPrice);
            System.out.println("Longest city name: " + longName);
            System.out.println("Cheapest truck: " + cheapoTruck);
            System.out.println("Total number of tires on cars: " + amntCarTires);
            System.out.println("Total number of tires on trucks: " + amntTruckTires);
            System.out.println("Total number of tires on buses: " + amntBusTires);



        } catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
