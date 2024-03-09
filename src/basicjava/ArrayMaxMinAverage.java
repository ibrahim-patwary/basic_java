package basicjava;

import java.util.Scanner;

public class ArrayMaxMinAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        double average = 0, sum = 0;
        int k = 0;

        System.out.print("Enter the TEN elements of an array :- ");

        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
            k++;
        }

        int max = number[0];
        int min = number[0];
        for (int i = 1; i < 10; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + number[i];
        }
        average = (sum / k);

        System.out.print("The maximum value is :-> " + max);
        System.out.print("\nThe minimum value is :-> " + min);
        System.out.println("\nThe Summation value is:->"+sum);
        System.out.printf("\nThe average value is :-> %.2f", average);

    }

}
