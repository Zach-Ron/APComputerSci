package Q1;

public class Prog122d {
    public static void main(String[] args){
        for (int place = -12; place <= 16; place++){
            int y = (int)(Math.pow(place,6) - (3*Math.pow(place,5)) - (93*Math.pow(place,4)) + (87*Math.pow(place,3))
                    + (1596*Math.pow(place,2)) - (1380*(place)) - 2800);
            System.out.println(place + "\t" + y);
        }
    }
}
/*
-12	1897280
-11	982800
-10	453600
-9	173888
-8	45360
-7	0
-6	-6400
-5	0
-4	6048
-3	7280
-2	4320
-1	0
0	-2800
1	-2592
2	0
3	2240
4	0
5	-10800
6	-32032
7	-60480
8	-84240
9	-78400
10	0
11	217728
12	671840
13	1496880
14	2872800
15	5033600
16	8276688
 */
