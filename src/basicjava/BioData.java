package basicjava;

import java.util.Scanner;

public class BioData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, num1;

        System.out.print("\nEnter two number :- ");
        num = input.nextInt();
        num1 = input.nextInt();
        System.out.printf("The summation value is = %d\n ", (num + num1));
        String name;
        input.nextLine();
        System.out.print("Enter your name :-");
        name = input.nextLine();
        System.out.printf("My name is %s \n", name);
    }
}
