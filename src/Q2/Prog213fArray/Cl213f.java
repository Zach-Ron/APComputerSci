package Q2.Prog213fArray;


public class Cl213f {
    private double myKwh;
    private double myCost;


    public Cl213f(double kwh)
    {
        myKwh = kwh;
        myCost = 0;
    }

    //TODO: Complete
    public void calc() {
        if (myKwh < 2000)
        {
            myCost = myKwh * .07;
        }
        else if (myKwh > 2000 && myKwh < 10000)
        {
            myCost = (2000 * .07) + (myKwh - 2000) * .05;
        }else if (myKwh > 10000)
        {
            myCost = myCost = (2000 * .07) + (8000 * .05) + ((myKwh - 10000) * .04);
        }

        myCost = Math.round(myCost * 100);
        myCost /= 100;

    }
//TODO:
    public String toString(){
        return "The cost of " + myKwh + " is: $" + myCost;
    }
}
/*
The cost of 1338.0 is: $93.66
The cost of 9631.0 is: $521.55
The cost of 13561.0 is: $682.44
 */

