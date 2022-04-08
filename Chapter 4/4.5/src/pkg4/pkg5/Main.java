
package pkg4.pkg5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = sc.nextInt();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();

        double area = (numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides)));

        System.out.println("The area of the polygon is " + area);
    }
}
