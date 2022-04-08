
package pkg2.pkg15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = Sc.nextDouble();
        double y1 = Sc.nextDouble();
        
        System.out.print("Enter x2 and y2: ");
        double x2 = Sc.nextDouble();
        double y2 = Sc.nextDouble();

        double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double sqrRoot = Math.pow(determinant, 0.5);

        System.out.printf("The distance between two points is: "+sqrRoot);
    }
}
