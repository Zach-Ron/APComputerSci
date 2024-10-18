package Q1;

public class LP5_9 {
    public static void main(String[] args){
        int res=0, num=0, power=0;

        for (;power >= 10; power++){
            System.out.println("\tx^" + power);
            for (;num >= 6; num ++) {
                res = power ^ num;
                System.out.println(res);
            }
            break;
        }


    }
}
