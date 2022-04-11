import java.util.Scanner;

public class Ex19 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[sc.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        System.out.println("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}