
package pkg3.pkg3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = Sc.nextDouble();
		double b = Sc.nextDouble();
		double c = Sc.nextDouble();
		double d = Sc.nextDouble();
		double e = Sc.nextDouble();
		double f = Sc.nextDouble();

		if (a * d - b * c == 0) {
                    System.out.println("The equation has no solution.");
                }
		else
		{
                    double x = (e * d - b * f) / (a * d - b * c);
                    double y = (a * f - e * c) / (a * d - b * c);
                    System.out.println("x is " + x + " and y is " + y);
		}
    }
}
