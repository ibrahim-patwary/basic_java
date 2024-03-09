package basicjava;

import java.util.Scanner;

public class FahrenheitToClesius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cles, fahr;
        System.out.print("Enter the value of Faherheit :- ");
        fahr = input.nextDouble();
        cles =0.56*(fahr-32);
        System.out.printf("The clesious temperture is = %.3fC\n", cles);

    }

}
