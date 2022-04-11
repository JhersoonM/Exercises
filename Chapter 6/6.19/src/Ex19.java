
import java.util.Scanner;

public class Ex19 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is " + area(side1, side2, side3) : "Input is invalid");
    }

    public static boolean isValid(
            double side1, double side2, double side3) {
        boolean valid =
                side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        return valid;
    }

    public static double area(
            double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}