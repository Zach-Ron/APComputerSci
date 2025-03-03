package Q3.prog703s;

public class mac extends computer{
    private String color;
    private int amntcol = 0;
    public mac(String n, int num, double val, String col){
        super(n, num, val);
        color = col;
        checkCol(color);
    }

    public void checkCol(String c){
        if (c.equals("Green") || c.equals("Gold"))
            amntcol++;
    }
    public int getAmnt(){
        return amntcol;
    }
}
