
package pkg1.pkg17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

	System.out.print("Enter the temperature in Fahrenheit " + "between -58ºF and 41ºF: ");
	double temperature = Sc.nextDouble();
	System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
	double speed = Sc.nextDouble();
	double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

	System.out.println("The wind chill index is " + windChill);
    }
}
