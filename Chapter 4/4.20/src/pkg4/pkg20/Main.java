
package pkg4.pkg20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sting: ");
        String str = sc.nextLine();

        System.out.println(str + " has a length of " + str.length() + " and its first character is " + str.charAt(0));
    }
}
