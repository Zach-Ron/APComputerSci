package Q2;

public class bigArray {
    public static void main(String[] Args){
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = (int) (Math.random() * (91 - 20) + 20);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "");
        System.out.println();

        for (int temp : array)
            System.out.print(temp + " ");
        System.out.println();

        System.out.println("The middle number is: " + array[array.length / 2]);

        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Avg of first mid and last nums is: " + (avg/3));

        int smallest = array[0];
        int largest = array[0];
        for (int num : array){
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);


        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i< array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }

        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        int randNum = (int) (Math.random() * 10 + 1);
        array[array.length / 2] = randNum;
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < array.length; i++)
            array[i] += 10;
        for (int x : array)
        System.out.println();

        int myThird = array[2];
        array[2] = 5;
        System.out.println("The num that was ousted is " + myThird);

        for (int num : array)
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        System.out.println();

        for (int i = 0; i < array.length; i++)
            if (array[i] % 4 == 0)
                System.out.print(array[i] + " ");
        System.out.println();

        boolean sixty = false;
        for (int n : array)
            if (n==60) sixty = true;
        System.out.println("Is 60 in the list: " + 60);

        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++)
            if (array[lcv] != array[array.length-1 - lcv])
                same = false;
        System.out.println("Is array palindromic: " + same);

        double average = 0;
        for (int x : array) average += x;
        average /= array.length;

        int avgCount = 0;
        for (int x : array)
            if (x > average) avgCount++;
        System.out.printf("there are  %d numbers greater than the average\n", avgCount);

        int evens = 0;
        for (int num : array)
            if (num % 2 == 0) evens++;
        System.out.printf("theres %d even nums\n", evens);

        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[(array.length-1)];

        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();

        int[] shiftArr = circularShiftRight(array);
        for(int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        int sum = 0;
        for (int num : array){
            int digitSum = 0;
            int temp = num;
            while (temp > 0)
            {
                int n = temp % 10;
                temp /= 10;
                digitSum += n;
            }
            sum += digitSum;
        }
        System.out.println("Sum of all digits of all elements: " + sum);
    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length-1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
