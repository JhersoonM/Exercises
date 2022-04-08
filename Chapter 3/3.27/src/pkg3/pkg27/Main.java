
package pkg3.pkg27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

	System.out.print("Enter a point's x- and y-coordinates: ");
	double x = SC.nextDouble();
	double y = SC.nextDouble();

	double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
	double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

	System.out.println("The point " + ((x > intersectx || y > intersecty) ? "is not " : "is " ) + "in the triangle");
    }
}
