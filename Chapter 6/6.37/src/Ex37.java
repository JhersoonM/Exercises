
import java.util.Scanner;

public class Ex37 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");
        int number = sc.nextInt();
        int width = sc.nextInt();

        System.out.println(number + " formatted to width " + width + ": " + format(number, width));
    }

    public static String format(int number, int width) {
        String num = number + "";

        if (num.length() < width) {
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}