
package Excs2;

import java.util.Scanner;

public class Excs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area=0;
        double volum=0;
        
        System.out.println("Enter length of the sides and height of the Equilateral triangle: "); 
        double length = sc.nextDouble();
        
        area = (Math.sqrt(3) / 4)*(length * length);
        volum= area * length;
        
        System.out.println("The area is: "+area);
        System.out.println("The volume of the Triangular prism is: "+volum);
    }
    
}
