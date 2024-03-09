package basicjava;

import java.util.Scanner;

public class Matrix01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] a = new int[4][5];
        int k = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                a[row][col] = k;
                k++;

            }

        }
        System.out.println("A:- ");

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("  \t" + a[row][col]);

            }
            System.out.println("\n \n");
        }
    }
}
