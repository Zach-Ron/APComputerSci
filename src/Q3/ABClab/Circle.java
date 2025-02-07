package Q3.ABClab;

public class Circle implements Shape{
    private double radius;

    public Circle(double r) { radius = r; }

    public void calcArea() {
        System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
    }

    public void calcPerim(){
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public void printClass() {
        System.out.println(this.getClass().getSimpleName());
    }

    public void calcCircumference(){ this.calcPerim(); }

}
