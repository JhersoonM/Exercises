
package pkg3.pkg8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter three integers: ");
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();

	int temp;
	if (number2 < number1 || number3 < number1)
	{
		if (number2 < number1)
		{
                    temp = number1;
                    number1 = number2;
                    number2 = temp; 
		}
		if (number3 < number1)
		{
                    temp = number1;
                    number1 = number3;
                    number3 = temp;
		}
        }
	if (number3 < number2)
	{
            temp = number2;
            number2 = number3;
            number3 = temp;
	}

	System.out.println(number1 + " " + number2 + " " + number3);
    }
}
