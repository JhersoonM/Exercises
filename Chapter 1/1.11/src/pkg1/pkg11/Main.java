
package pkg1.pkg11;

public class Main {

    public static void main(String[] args) {
    /*
        One birth every 7 seconds
        One death every 13 seconds
        One new immigrant every 45 seconds
    */
        int population = 312032486;
        int SecondsPDay = 86400;
        int SecdsP5Year = (SecondsPDay*365)*5;
        
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
