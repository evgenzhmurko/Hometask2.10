package oop;

public class Task91 {
    public static void main(String[] args) {
//        Не сработало((
        int n = 3;
        int m = 2;
        int[][] Arr = new int[n][m];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] =(int) Math.round((Math.random() * 100) + 0);
                for (int f = 0; f <Arr.length ; f++) {
                    if (Arr[i][j]>Arr[i+1][j+1]) {
                        int temp = Arr[i][j];
                        Arr[i][j] = Arr[i + 1][j+1];
                        Arr[i + 1][j+1] = temp;
                    }
                }
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
