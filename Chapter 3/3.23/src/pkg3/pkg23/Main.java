
package pkg3.pkg23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

	System.out.print("Enter a point with two coordinates: ");
	double x = SC.nextDouble();
	double y = SC.nextDouble();

	boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

	System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle");
    }
}
