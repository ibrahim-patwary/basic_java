package basicjava;

import java.util.Scanner;

public class StringBufferDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name :- ");

        String name = input.nextLine();
        String name1;
        System.out.print("Enter your last name :- ");
        name1 = input.nextLine();
        StringBuffer sb = new StringBuffer(name);
        StringBuffer ab = new StringBuffer(name1);

        //Append method
        sb.append(ab);
        System.out.println("My full name is " + sb);
        //Delete method
        sb.delete(0, 5);
        System.out.println(sb);
        // Reverse method
        sb.reverse();
        System.out.println(sb);

    }
}
