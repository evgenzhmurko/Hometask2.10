package oop;

import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {
        int[] a = {67, 21, 300, 42, 57, 2, 71, 33, 98};

        int min = a[0];
        int max = a[a.length - 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        String x = Integer.toString(min);
        String y = Integer.toString(max);

        System.out.println("Min value is " + min);
        System.out.println("Min value length is " + x.length());
        System.out.println("Max value is " + max);
        System.out.println("Min value length is " + y.length());


    }


}

