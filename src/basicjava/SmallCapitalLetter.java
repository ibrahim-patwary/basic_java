package basicjava;

import java.util.Scanner;

public class SmallCapitalLetter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter for find small and capital letter :");
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This letter is a small letter.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This letter is a capital letter.");
        } else {
            System.out.println("Your input is Invalid...");
        }
    }

}
