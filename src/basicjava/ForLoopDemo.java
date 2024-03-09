package basicjava;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int i, j, prod = 0;
        System.out.printf("Enter a digit :");
        j = input.nextInt();

        for (i = 1; i <= 10; i++) {
            prod = j * i;
            System.out.printf("%d * %d = %d\n", j, i, prod);
        }

    }

}
