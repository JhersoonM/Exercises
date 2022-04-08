
package pkg4.pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = sc.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The are of the hexagon is %4.2f\n", area);
    }
}
