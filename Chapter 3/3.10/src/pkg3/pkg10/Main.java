
package pkg3.pkg10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int number1 = (int)(Math.random() * 100);
	int number2 = (int)(Math.random() * 100);

	System.out.print("What is " + number1 + " + " + number2 + "? ");
        
	int answer = sc.nextInt();
	if (number1 + number2 == answer) {
            System.out.println("You are correct!");
        }
	else {
            System.out.println("You are wrong " + number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
