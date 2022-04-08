package pkg4.pkg14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String s = sc.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'F' && ch != 'E') {
            System.out.print("The numeric value for grade " + ch + " is ");
            switch (ch) {
                case 'A':
                    System.out.println(4);
                    break;
                case 'B':
                    System.out.println(3);
                    break;
                case 'C':
                    System.out.println(2);
                    break;
                case 'D':
                    System.out.println(1);
                    break;
                case 'F':
                    System.out.println(0);
            }
        } else {
            System.out.println(ch + " is an invalid grade");
        }
    }
}
