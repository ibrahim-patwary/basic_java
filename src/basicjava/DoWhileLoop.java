package basicjava;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, j;

        System.out.print("Enter two digit :- ");
        i = input.nextInt();
        j = input.nextInt();

        do {
            System.out.println(i);
            i=i+2;
        } while (i <= j);

    }

}
