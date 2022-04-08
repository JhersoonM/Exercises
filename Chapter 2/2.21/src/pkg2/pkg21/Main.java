
package pkg2.pkg21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

	System.out.print("Enter investment amount: ");
	double amount = Sc.nextDouble();
	System.out.print("Enter annual interest rate in percentage: ");
	double monthlyInterestRate = Sc.nextDouble();
	monthlyInterestRate /= 1200;
	System.out.print("Enter number of years: ");
	int years = Sc.nextInt();

	double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
	System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
