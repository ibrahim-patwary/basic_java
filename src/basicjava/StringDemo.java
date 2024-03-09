package basicjava;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Enter your name :-");
        name = input.nextLine();
        System.out.printf("\nMy name is %s \n", name);

        String name1;
        System.out.print("\nEnter your best friend name :-");
        name1 = input.nextLine();
        System.out.printf("\nMy best friend name is %s \n", name1);
        //Equals method.......   
        boolean ans = name.equalsIgnoreCase(name1);
        System.out.println("Is Both string equal?\nans:- " + ans);
        //CodepointAl method.....
        int value = name.codePointAt(4);
        System.out.println("\nASCI value :-->> " + value);

    }

}
