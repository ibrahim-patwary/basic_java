package basicjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.print("Enter the five(5) ARRAYLIST  elements :- ");
        for (i = 0; i < 5; i++) {

            number.add(i, input.nextInt());

        }

        System.out.println("\t" + number);

    }
}
