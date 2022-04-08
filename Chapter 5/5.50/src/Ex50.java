
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                count++;
            }
        }

        System.out.println("Tne number of uppercase letters is " + count);
    }
}