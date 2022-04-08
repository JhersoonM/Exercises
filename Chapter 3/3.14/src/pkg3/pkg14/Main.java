
package pkg3.pkg14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	int coin = (int)(Math.random() * 2);

	System.out.print("Enter a guess 0-head or 1-tail: ");
	int guess = sc.nextInt();

	System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess."); 
    }
}
