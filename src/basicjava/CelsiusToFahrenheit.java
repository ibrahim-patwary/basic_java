package basicjava;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cles, fahr;
        System.out.print("Enter the value of clesious :- ");
        cles = input.nextDouble();
        fahr = 1.8 * cles + 32;
        System.out.printf("The Fahrenheit temperture is = %.3fF\n", fahr);
    }

}
