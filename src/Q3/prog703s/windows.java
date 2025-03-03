package Q3.prog703s;

public class windows extends computer{
    private double version;
    private int amntver = 0;
    public windows(String n, int num, double val, double ver){
        super(n, num, val);
        version = ver;
        checkVer(version);
    }

    public void checkVer(double v){
        if (v == 7.0){
            amntver++;
        }
    }

    public int getAmnt(){
        return amntver;
    }
}
