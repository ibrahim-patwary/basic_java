package basicjava;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] values = new int[5];
        int sum = 0;
        int product = 1;
        System.out.print("Please enter the values :- ");
        for (int i = 0; i < 5; i++) {

            values[i] = input.nextInt();
        }
        System.out.print("The summation value :- ");
        for (int i = 0; i < 5; i++) {

            sum = sum + values[i];
            product = product * values[i];
        }
        System.out.printf("%d \n", sum);
        System.out.print("The product of the given values :-" + product);
        System.out.println("");
    }

}
