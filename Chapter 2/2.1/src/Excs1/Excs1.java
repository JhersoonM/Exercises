
package Excs1;

import java.util.Scanner;

public class Excs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double km=0;
        System.out.println("Enter miles: "); double miles = sc.nextInt();
        
        km = miles * 1.6;
        
        System.out.println(miles+" miles is "+km+" kilometers");
    }
}
