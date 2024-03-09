package basicjava;

import java.util.Scanner;

public class Problem_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, num1, num2;
        System.out.print("Enter three integer number's :- ");
        num = input.nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num > num1 && num > num2) {

            System.out.printf(" %d is a largest number.", num);
        } else if (num < num1 && num1 > num2) {
            System.out.printf(" %d is a largest number.", num1);
        }
        else
        {
              System.out.printf(" %d is a largest number." , num2);
        }

    }

}
