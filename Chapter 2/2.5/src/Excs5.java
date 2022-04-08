
import java.util.Scanner;


public class Excs5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subt = sc.nextDouble();
        double grat = sc.nextDouble();
        
        grat = (grat/100)*subt;
        subt = subt+grat;
        System.out.println("The gratuity is $"+grat+" and total is $"+subt);
        
    }
}
