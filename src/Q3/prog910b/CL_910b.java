package Q3.prog910b;

public class CL_910b {

    private static int num;
    private static int base;
    private static int end;
    private static int count = 0;

    public static void Calc(int h, int b){
        base = b;
        num = h;
        int res;
        int res1;
        res1 = num/base;
        res = num % base;
        count++;

        if(res1 <= base) {
        }else{
            if (count == 1) {
                end = res;
            } else {
                end = ((int) (end * Math.pow(10, count))) + res;
            }
                Calc(res1, b);
        }
    }

    public static int getCalc(){
        return end;
    }


}
