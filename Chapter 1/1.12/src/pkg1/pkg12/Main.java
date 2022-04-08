
package pkg1.pkg12;

public class Main {

    public static void main(String[] args) {
        //time: 1:40:35
       
        double distMil = 24;
        double distKm = distMil * 1.6;

        double timeInMinutes = 60.0 + 40 + 35 / 60.0;

        double kmPH = 60.0 * distKm / timeInMinutes;

        System.out.println("Kilometers per Hour: "+kmPH);
    }
}
