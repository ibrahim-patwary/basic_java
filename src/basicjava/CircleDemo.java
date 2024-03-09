package basicjava;

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter the value of radius :- ");
        radius = input.nextDouble();
        area = (3.1416 * radius * radius);
        System.out.printf("The area of radius value is :- %f\n",area);

    }

}
