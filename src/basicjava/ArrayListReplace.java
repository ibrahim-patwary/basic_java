package basicjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, pos, NewValue;
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.print("Enter the five(5) ARRAYLIST  elements :- ");
        for (i = 0; i < 5; i++) {

            number.add(i, input.nextInt());

        }

        System.out.println(" \n " + number);

        System.out.print("Which index value you wanted to replace:- ");
        pos = input.nextInt();
        System.out.print("Enter the new value :- ");
        NewValue = input.nextInt();
        number.set(pos, NewValue);
        System.out.println(" \n " + number);

    }

}
