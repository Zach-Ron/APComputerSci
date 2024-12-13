package Q2.prog435A;

public class CL435 {
    private int vehicleNum;
    private double factor;
    private double price;
    private int gateNum;
    private int total;

    public CL435(int number, int gate){
        vehicleNum = number;
        gateNum = gate;
        total = 0;
    }

    public double getVehicleFactor()
    {
        if (vehicleNum == 1) factor = 1.00;
        else if (vehicleNum == 2) factor = 1.30;
        else if (vehicleNum == 3) factor = 1.60;
        else if (vehicleNum == 4) factor = 2.00;
        else if (vehicleNum == 5) factor = 2.40;
        else factor = 2.70;
        return (factor);
    }

    public double getRate()
    {
        if (gateNum == 1) price = 1.35;
        else if (gateNum == 2) price = 2.00;
        else if (gateNum == 3) price = 2.50;
        else if (gateNum == 4) price = 3.25;
        else if (gateNum == 5) price = 4.10;
        else if (gateNum == 6) price = 4.80;
        else if (gateNum == 7) price = 5.50;
        else price = 6.00;

        return (price);
    }

    public double getTotal()
    {
        total =
        return total;
    }

    }
