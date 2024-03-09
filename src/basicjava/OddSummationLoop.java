package basicjava;

import java.util.Scanner;

public class OddSummationLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0, i, num, num1;
        System.out.print("Enter intial number :- ");
        num = input.nextInt();
        System.out.print("Enter final number :- ");
        num1 = input.nextInt();
        for (i = num; i <= num1; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }

        }
        System.out.println("The summation of odd whole values = " + sum);

    }

}
