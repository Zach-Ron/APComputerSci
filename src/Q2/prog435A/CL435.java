package Q2.prog435A;

public class CL435 {
    private double price, factor, total;
    private int gateNum, vehicleNum;
    String car;

    public CL435(){
        vehicleNum = 0;
        gateNum = 0;
        price = 0;
        factor = 0;
        total = 0;
        car = "";
    }

    public CL435(int number, int gate){
        vehicleNum = number;
        gateNum = gate;
    }

    public void setVehicleFactor()
    {
        if (vehicleNum == 1)
        {
            factor = 1.00;
            car = "Compact Car";
        }
        else if (vehicleNum == 2)
        {
            factor = 1.30;
            car = "Small Car  ";
        }
        else if (vehicleNum == 3)
        {
            factor = 1.60;
            car = "Mid Size Car";
        }
        else if (vehicleNum == 4)
        {
            factor = 2.00;
            car = "Full Size Car";
        }
        else if (vehicleNum == 5)
        {
            factor = 2.40;
            car = "Truck        ";
        }
        else
        {
            factor = 2.70;
            car = "16 Wheeler   ";
        }
    }

    public void setRate()
    {
        if (gateNum == 1) price = 1.35;
        else if (gateNum == 2) price = 2.00;
        else if (gateNum == 3) price = 2.50;
        else if (gateNum == 4) price = 3.25;
        else if (gateNum == 5) price = 4.10;
        else if (gateNum == 6) price = 4.80;
        else if (gateNum == 7) price = 5.50;
        else price = 6.00;
    }

    public void setTotal()
    {
        total = price * factor;
    }

    public double getTotal(){
        return total;
    }
    public double getRate(){
        return (price);
    }
    public double getFactor(){
        return(factor);
    }
    public String getCar(){
        return (car);
    }

    }
