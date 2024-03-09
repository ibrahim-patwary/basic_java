
package basicjava;

import java.util.Scanner;


public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        
        int num, sum = 0, r, temp;
        System.out.print("Enter a NUMBER :- ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;

        }
        
      if(sum==num)
      {
          System.out.println("This number is a ARMSTRONG number...");
      }
      else
      {
           System.out.println("This number is not a ARMSTRONG number...");
      }
    }
    
}
