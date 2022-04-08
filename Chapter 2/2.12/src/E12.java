
import java.util.Scanner;


public class E12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double length=0;
        
        System.out.println("Enter speed and acceleration: ");
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        
        length = (v*v) / (2*a);
        
        System.out.println("The minimum runway length for this airplane is: "+length);
        
    }
}
