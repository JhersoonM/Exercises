
package pkg4.pkg21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String ssn = sc.nextLine();

        boolean isValid =
                (ssn.length() == 11)
                && (Character.isDigit(ssn.charAt(0)))
                && (Character.isDigit(ssn.charAt(1)))
                && (Character.isDigit(ssn.charAt(2)))
                && (ssn.charAt(3) == '-')
                && (Character.isDigit(ssn.charAt(4)))
                && (Character.isDigit(ssn.charAt(5)))
                && (Character.isDigit(ssn.charAt(7)))
                && (ssn.charAt(6) == '-')
                && (Character.isDigit(ssn.charAt(8)))
                && (Character.isDigit(ssn.charAt(9)))
                && (Character.isDigit(ssn.charAt(10)));

        System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ") + "social security number");
    }
}
