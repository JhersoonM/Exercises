
import java.util.Scanner;


public class E10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double It=0,Ft=0,M=0,R=0;
        
        System.out.println("Enter the amount of water in kilograms: "); M = sc.nextDouble();
        System.out.println("Enter the initial temperature: "); It = sc.nextDouble();
        System.out.println("Enter the final temperature: "); Ft = sc.nextDouble();
        
        R = M * (Ft - It) * 4184;
        
        System.out.println("The energy needed is: "+R);
    }
}
