package oop;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] Arr = new int[n][m];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print("Input nubmer ");
                Arr[i][j] = in.nextInt();
            }
        }
        for (int[] aMatrix : Arr) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix );
            }
            System.out.println();
        }
    }
}
