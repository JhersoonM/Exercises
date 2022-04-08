
package pkg4.pkg22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String string1 = sc.nextLine();
        System.out.print("Enter string s2: ");
        String string2 = sc.nextLine();

        System.out.println(string2 + ((string1.contains(string2)) ? " is " : " is not ") + "a substring of " + string1);
    }
}
