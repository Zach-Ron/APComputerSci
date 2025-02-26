package Q3.prog703s;

public class linux extends computer{
    private int code;

    public linux(String n, int num, double val, int secret){
        super(n, num, val);
        code = secret;
    }
}
