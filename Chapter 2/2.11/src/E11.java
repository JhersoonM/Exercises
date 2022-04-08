
import java.util.Scanner;


public class E11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        One birth every 7 seconds
        One death every 13 seconds
        One new immigrant every 45 seconds
        */
        System.out.println("Enter the number of years: "); int year = sc.nextInt();
        
        int population = 312032486;
        int SecondsPDay = 86400;
        int SecdsP5Year = (SecondsPDay*365) * year;
        
        int birth = (SecdsP5Year/7);
        int death = (SecdsP5Year/13);
        int immigrant = (SecdsP5Year/45);

        population = (population + birth + immigrant - death);        
        
        System.out.println("Birth: "+birth);
        System.out.println("Death: "+death);
        System.out.println("Immigrant: "+immigrant);
        
        System.out.println("Total population: "+population);
    }
}
