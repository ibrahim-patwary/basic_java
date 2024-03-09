package basicjava;

import java.util.Scanner;

public class FibonacoiDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("How many numbers :- ");
        n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.printf("%d %d ", first, second);
        int fibo;
        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.printf("%d ",fibo);
        }
        System.out.println("");
    }

}
