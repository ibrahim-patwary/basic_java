package basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[10];
        System.out.print("Enter TEN (10) elements :- ");
        for (int i = 0; i < 10; i++) {
            number[i] = input.nextInt();
        }
        Arrays.sort(number);
        System.out.print("Ascending of this elements:-");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" \t%d", number[i]);
        }

        System.out.print("\n\nDescending of this elements:-");
        for (int i = 9; i >= 0; i--) {
            System.out.printf(" \t%d", number[i]);
        }
        System.out.println("");
    }
}
