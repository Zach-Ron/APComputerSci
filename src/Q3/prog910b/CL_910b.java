package Q3.prog910b;

public class CL_910b {
private static int num;
private static int base;



    public static void setNum(int h){
        num = h;
    }

    public static void setBase(int b){
        base = b;
    }

    public static int Calc(int h, int b){
        int res;
        res = num % base;

        if(res == 0){
            return res;
        }

        return Calc(num, base);
    }


    public static int getNum(){
        return num;
    }

    public static int getBase(){
        return base;
    }
}
