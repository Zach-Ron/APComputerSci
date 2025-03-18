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
        int n = h;
        int ba = b;
        int res;
        int res1;
        res1 = num/base;
        res = num % base;

        if(res == 0){
            n = res1;
            return Calc(n, ba);
        }
        return res;
    }


    public static int getNum(){
        return num;
    }

    public static int getBase(){
        return base;
    }
}
