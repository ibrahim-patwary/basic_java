
package basicjava;

import java.util.Scanner;


public class WhileDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         int i,j;
        
        System.out.print("Enter two digit :- ");
        i=input.nextInt();
         j=input.nextInt();
       
       
        while(i<=j)
        {
            System.out.println(i);
            i++;
        }
        
    }
    
}
