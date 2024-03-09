package basicjava;

import java.util.Scanner;

public class ReversedDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0, r, temp;
        System.out.print("Enter a NUMBER :- ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        System.out.print("The Reversed numbers of a digit :->  " + sum);
        System.out.println("\n");

    }
}
