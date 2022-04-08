
package pkg3.pkg12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter a three-digit integer: ");
	int number = sc.nextInt();

	int digit1 = (int)(number / 100);
	int remaining = number % 100;
	int digit3 = (int)(remaining % 10);

	System.out.println(number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
}
