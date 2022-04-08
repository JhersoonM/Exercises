
package pkg1.pkg5;

public class Main {

    public static void main(String[] args) {
        float r1= (float) (7.5*6.5-4.5*3);
        float r2= (float) (47.5-5.5);
        double r;
        r=r1/r2;
        System.out.println(r+"\n"+r1+r2);
        
        String nGuardado; 
        String tunc;
        
        for(double i=1; i<=10; i++){
                 
                for(double j=1; j<=10; j++){
                        
                        
                        tunc = String.format("%.2f", i / j);
                        nGuardado = String.format("%.2f", r);
                        
                        
                        if(!tunc.equals(nGuardado)) {
                        tunc = String.format("%.2f", ((i / j) - 0.01));
                    }
                        

                        if(nGuardado.equals(tunc) ) {
                        System.out.println(i + "/" + j);
                    }                
                                
                        
                }
                 
         }
    }
}
