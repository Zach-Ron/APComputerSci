package Q1.Prog_213bCl;

public class Cl213b {
    private int myquantity;
    private double myPrice;
    private double myAmtDue;

    public Cl213b(int quantity){
        myquantity = quantity;
        myPrice = 0;
        myAmtDue = 0;

    }
    public void calc() {
        if      (myquantity > 0 && myquantity <= 99)    myPrice = 5.95;
        else if (myquantity > 99 && myquantity <=199)   myPrice = 5.75;
        else if (myquantity > 199 && myquantity <= 299) myPrice = 5.40;
        else if (myquantity > 299)                      myPrice = 5.15;
        myAmtDue = myPrice * myquantity;
    }
    public String toString(){
        return String.format("Quantity: %d\tPrice: $%.2f\t Amount Due: $%.2f",
                myquantity, myPrice, myAmtDue);
    }

}
