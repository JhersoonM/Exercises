import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        printCombinations(numbers);
    }

    public static void printCombinations(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}