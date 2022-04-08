
package pkg3.pkg25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

	System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
	double x1 = SC.nextDouble();
	double y1 = SC.nextDouble();
	double x2 = SC.nextDouble();
	double y2 = SC.nextDouble();
	double x3 = SC.nextDouble();
	double y3 = SC.nextDouble();
	double x4 = SC.nextDouble();
	double y4 = SC.nextDouble();

	double a = y1 - y2;
	double b = -1 * (x1 - x2);
	double c = y3 - y4;
	double d = -1 * (x3 - x4);
	double e = (y1 - y2) * x1 - (x1 - x2) * y1;
	double f = (y3 - y4) * x3 - (x3 - x4) * y3;

	if (a * d - b * c == 0)
	{
            System.out.println("The two lines are parallel");
	}
	else
	{
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
	}
    }
}
