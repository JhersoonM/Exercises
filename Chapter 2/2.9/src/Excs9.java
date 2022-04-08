
import java.util.Scanner;


public class Excs9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v0=0,v1=0,t=0,R=0;
        
        System.out.println("Enter v0, v1, and t: ");
        v0 = sc.nextDouble();
        v1 = sc.nextDouble();
        t = sc.nextDouble();
        
        R = (v1 - v0) / t;
        
        System.out.println("The average acceleration is: "+R);
    }
}
