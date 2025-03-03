package Q3.prog703s;

public class linux extends computer{
    private int code;
    private int amntCode = 0;

    public linux(String n, int num, double val, int secret){
        super(n, num, val);
        code = secret;
        checkCode(code);
    }

    public void checkCode(int c){
        if (c % 5 == 0 && c % 10 != 0)
            amntCode++;
    }

    public int getAmnt(){
        return amntCode;
    }
}
