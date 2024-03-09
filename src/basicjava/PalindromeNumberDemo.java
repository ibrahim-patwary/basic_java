
package basicjava;

import java.util.Scanner;


public class PalindromeNumberDemo {
    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, sum = 0, r, temp;
        System.out.print("Enter a NUMBER :- ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if(sum==num)
        {
            System.out.print("This number is a plindrome number... ");  
        }
        else
        {
            System.out.print("This number is not a plindrome number.... ");
        }
        
     

    }
}

