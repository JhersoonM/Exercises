
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        long number = sc.nextLong();

        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }

    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}