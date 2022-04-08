
import java.util.Scanner;


public class Excs4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pings=0;
        System.out.println("Enter a number in square meters: "); double Smeter = sc.nextInt();
        
        pings = Smeter * 0.3025;
        
        System.out.println(Smeter+" square meters is "+pings+" pings");
    }
}
