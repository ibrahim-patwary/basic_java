package basicjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemove {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, value;
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.print("Enter the five(5) ARRAYLIST  elements :- ");
        for (i = 0; i < 5; i++) {

            number.add(i, input.nextInt());

        }

        System.out.println(" \n " + number);

        System.out.print("Which index value you wanted to removed:- ");
        value = input.nextInt();

        number.remove(value);
        System.out.println(" \n " + number);

    }

}
