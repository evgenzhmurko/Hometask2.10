package oop;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] a = {67, 9, 302};
        String first = Integer.toString(a[0]);
        int firstx = first.length();
        String second = Integer.toString(a[1]);
        int secondx = second.length();
        String third = Integer.toString(a[2]);
        int thirdx = third.length();

        int[] q = {Integer.parseInt(firstx+first), Integer.parseInt(secondx+second), Integer.parseInt(thirdx+third)};
        BubbleSort(q);
        System.out.println(Arrays.toString(q));
    }
        private static void BubbleSort(int[] m) {
            for (int i = m.length - 1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (m[j]>m[j+1]) {
                        int temp = m[j];
                        m[j] = m[j + 1];
                        m[j + 1] = temp;
                    }
                }
            }
        }

    }

