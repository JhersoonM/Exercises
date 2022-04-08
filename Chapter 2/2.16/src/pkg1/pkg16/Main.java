
package pkg1.pkg16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

	System.out.print("Enter the side: ");
	double side = Sc.nextDouble();
	double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

	System.out.println("The area of the hexagon is " + area);
    }
}
