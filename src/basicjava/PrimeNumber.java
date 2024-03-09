package basicjava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, num, count = 0;

        System.out.print("Enter a number :- ");

        num = input.nextInt();

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("This number is a prime number ...");
        } else {
            System.out.println("This number is not a prime number...");
        }
    }

}
