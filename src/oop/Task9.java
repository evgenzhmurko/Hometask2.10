package oop;


public class Task9 {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] Arr = new int[n][m];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] =(int) Math.round((Math.random() * 100) + 0);
            }
        }
        for (int[] aMatrix : Arr) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix+" " );
            }
            System.out.println();
        }
    }
}
