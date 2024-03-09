package basicjava;

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] a = new int[3][3];
        int SumOfDiagonal = 0;
        int SumOfUpper = 0;
        int SumOfLower = 0;

        System.out.print("Enter the elements of A matrix:- ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                a[row][col] = input.nextInt();

            }
        }
        System.out.println("A:- ");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("  \t" + a[row][col]);

            }
            System.out.println("\n \n");
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    SumOfDiagonal = SumOfDiagonal + a[row][col];
                }
                if (row < col) {
                    SumOfUpper = SumOfUpper + a[row][col];
                }
                if (row > col) {
                    SumOfLower = SumOfLower + a[row][col];
                }
            }
        }

        System.out.printf("The summation of diagonal value is :-> %d", SumOfDiagonal);
        System.out.printf("\nThe value is summation of Upper elements :-> %d", SumOfUpper);
        System.out.printf("\nThe value is summation of Lower elements :-> %d \n", SumOfLower);

    }

}
