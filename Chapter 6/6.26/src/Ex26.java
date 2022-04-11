
import java.util.Scanner;

public class Ex26 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ")+ "a palindrome.");
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}