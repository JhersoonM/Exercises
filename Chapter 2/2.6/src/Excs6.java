
import java.util.Scanner;


public class Excs6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number between 0 and 1000: ");
		int num = sc.nextInt();
                int mult=0;
                int number = num;
                
		int num3 = number % 10;		
		number /= 10;							
                
                int num2 = number % 10;				
		number /= 10;							
                
                int num1 = number % 10;		
		number /= 10;							
                
                if(num1 == 0){
                    mult = num2 * num3;
                } else if(num2 == 0){
                    mult = num1 * num3;
                } else if(num3 == 0){
                    mult = num2 * num1;
                } else{
                    mult = num1 * num2 * num3;
                }
                
		
		System.out.println("The multiplication of all digits in "+num+" is "+mult);
    }
}
