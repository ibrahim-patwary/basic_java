package basicjava;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, num1;
        CalculatorMini calculation = new CalculatorMini();
        System.out.print("Enter two number :- ");
        num = input.nextDouble();
        num1 = input.nextDouble();
        double result = calculation.summation(num, num1);
        System.out.printf("Summation value :- %.2f \n" , result);
         double result1 = calculation.Subtraction(num, num1);
        System.out.printf("Subtraction value :- %.2f \n" , result1);
         double result2 = calculation.Multiplication(num, num1);
        System.out.printf("Multiplication value :- %.2f \n" , result2);
         double result3 = calculation.Division(num, num1);
        System.out.printf("Division value :- %.2f \n" , result3);

    }
}
