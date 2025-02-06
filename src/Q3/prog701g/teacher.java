package Q3.prog701g;

public class teacher extends person {
    private int myNumStuds;

    public teacher(String fn, String ln, int stu) {
        super(fn, ln);
        myNumStuds = stu;
    }

    public int getNumStuds() { return myNumStuds; }

}
