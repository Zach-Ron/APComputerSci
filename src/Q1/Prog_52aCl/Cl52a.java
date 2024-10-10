package Q1.Prog_52aCl;
import java.util.Scanner;

public class Cl52a {
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;


    public Cl52a(int len, int wid){
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;

    }

    public void calc(){
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    public int getArea(){return myArea;   }
    public int getPerim(){return myPerim; }

}
