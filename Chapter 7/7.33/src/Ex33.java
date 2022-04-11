import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
            "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(zodiacs[year % 12]);
    }
}