package basicjava;

import java.util.Scanner;

public class Array2dMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];

        System.out.print("Enter the elements of A matrix:- ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                a[row][col] = input.nextInt();

            }
        }
        System.out.print("Enter the elements of B matrix:- ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col] = input.nextInt();

            }

        }
        System.out.println("A:- ");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  \t" + a[row][col]);

            }
            System.out.println("\n \n");
        }
        System.out.println("\nB:- ");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  \t" + b[row][col]);

            }
            System.out.println("\n \n");
        }
        System.out.println("A+B:-");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  \t" + (a[row][col] + b[row][col]));

            }
            System.out.println("\n \n");
        }
    }
}
