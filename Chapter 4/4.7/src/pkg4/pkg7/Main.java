
package pkg4.pkg7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a character: ");
        String f = sc.nextLine();
        
        char ch = f.charAt(0);
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }

}
