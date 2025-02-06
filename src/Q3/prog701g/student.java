package Q3.prog701g;

public class student extends person {
    private double myGPA;

    public student(String fn, String ln, double gpa) {
        super(fn, ln); //call the super class works well for privates in parent class
        myGPA = gpa;
    }
    public double getGPA() { return myGPA; }

}
