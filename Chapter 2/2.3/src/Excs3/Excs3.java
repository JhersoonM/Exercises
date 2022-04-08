
package Excs3;

import java.util.Scanner;

public class Excs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double feet=0;
        System.out.println("Enter meter: "); double meter = sc.nextInt();
        
        feet = meter * 3.2786;
        
        System.out.println(meter+" meters is "+feet+" feet");
    }
}
