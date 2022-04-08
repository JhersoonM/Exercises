
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short number = sc.nextShort();

        String bits = "";

        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }

        System.out.println("The bits are " + bits);
    }
}