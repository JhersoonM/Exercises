
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimial interger: ");
        int decimal = sc.nextInt();

        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }

        System.out.println("The binary value of the decimial \"" + decimal + "\" is: " + binary);
    }
}