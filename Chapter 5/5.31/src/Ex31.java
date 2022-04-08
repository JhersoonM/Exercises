
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentageYield = sc.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = sc.nextInt();

        System.out.println("Month  CD Value");

        for (int m = 1; m <= months; m++) {
            amount += amount * (percentageYield / 1200);
            System.out.printf("%-7d%.2f\n", m, amount);
        }
    }
}