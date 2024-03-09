
package basicjava;

import java.util.Scanner;


public class TriangleDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float base, height, area ;
        System.out.print("Enter the value of base :- ");
        base= input.nextFloat();
        System.out.print("Enter the value of height :- ");
        height = input.nextFloat();
        
        area = 0.5f* base*height;
        System.out.printf("The area of triangle value is = %.2f Unit.\n",area);
        
    }
    
}
