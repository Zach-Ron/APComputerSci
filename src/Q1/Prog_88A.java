package Q1;

public class Prog_88A {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int diff = num1 - num2;
        //todo: Product and average
        int Product = num1 * num2;
        int average = (num1 + num2) / 2;
        int abs = Math.abs(diff);

        int max, min;

        if (num1 > num2) {
            max = num1;

        } else {
            max = num2;

            if (max == num1) {
                min = num2;

            } else {
                min = num1;
            }
        }
    }
}