
package pkg2.pkg23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

	System.out.print("Enter the driving distace: ");
	double distace = Sc.nextDouble();
	System.out.print("Enter miles per gallon: ");
	double milesPerGallon = Sc.nextDouble();
	System.out.print("Enter price per gallon: ");
	double pricePerGallon = Sc.nextDouble();
	double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

	System.out.println("The cost of driving is $" + costOfDriving);
    }
}
