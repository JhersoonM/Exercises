import java.util.Scanner;

public class Ex30 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[sc.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println("The list has"
                + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;
            }
            if (count >= 4) {
                return true;
            }
            if (values[i] != values[i + 1]) {
                count = 1;
            }
        }
        return false;
    }
}