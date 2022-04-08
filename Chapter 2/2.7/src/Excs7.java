
import java.util.Scanner;


public class Excs7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minPDay = 1440;
        int minPYear = (minPDay * 365); 
        
        int days=0, years=0;
        
        System.out.println("Enter the number of minutes: ");
        int min = sc.nextInt();
        
        years = min / minPYear;
        days = min % minPYear;
        days = days / minPDay; 
        
        System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
    }
}
