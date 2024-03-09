package basicjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSorting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.print("Enter the five(5) ARRAYLIST  elements :- ");
        for (i = 0; i < 5; i++) {

            number.add(i, input.nextInt());

        }

        System.out.println(" The arraylist :->> \t" + number);
        Collections.sort(number);
        System.out.println("Ascending List :->> \t"+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending List :->> \t"+number);
    }

}
