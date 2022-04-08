
package pkg1.pkg4;

public class Main {

    public static void main(String[] args) {
        int pot2=2,pot3=3,pot4=4;
        int r2=1,r3=1,r4=1;
        
        System.out.println("a   a^2   a^3   a^4");
        System.out.println("1   1     1     1");
        
        for(int i=0;i<4;i++){
            r2=r2*2;
            if(i==1){
                pot2=r2;
            }
            if(i==2){
                pot3=r2;
            }
            if(i==3){
                pot4=r2;
                System.out.println("2   "+pot2+"     "+pot3+"     "+pot4);
            }
        }
        for(int i=0;i<4;i++){
            r3=r3*3;
            if(i==1){
                pot2=r3;
            }
            if(i==2){
                pot3=r3;
            }
            if(i==3){
                pot4=r3;
                System.out.println("2   "+pot2+"     "+pot3+"    "+pot4);
            }
        }
        for(int i=0;i<4;i++){
            r4=r4*4;
            if(i==1){
                pot2=r4;
            }
            if(i==2){
                pot3=r4;
            }
            if(i==3){
                pot4=r4;
                System.out.println("2   "+pot2+"    "+pot3+"    "+pot4);
            }
        }
    }
}
