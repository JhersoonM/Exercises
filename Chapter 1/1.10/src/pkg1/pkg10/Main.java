
package pkg1.pkg10;

public class Main {

    public static void main(String[] args) {
        
        double km = 15.0;
        double miles = km / 1.6;

        double r = (50.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double MPH = miles / r;

        System.out.println("Miles per hour: "+MPH);
    }
}
