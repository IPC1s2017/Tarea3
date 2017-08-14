package split;

import java.util.Scanner;

public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x,i,z,w,a,b,c,d,e;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        x=leer.nextInt();
        if (x>10){
            if (x<100){
                i=x/10;
                z=x-(i*10);
                if (i==z){
                    System.out.println("Su numero es split");
                }else{
                    System.out.println("Su numero no es split");
                }
            }else {
                if (x<1000){
                  System.out.println("Ingrese un numero de digitos pares");  
                }else {
                    if (x<10000){
                        i=x/100;
                        z=x-(i*100);
                        a=i/10;
                        b=i-(a*10);
                        c=z/10;
                        d=z-(c*10);
                        if (a+b==c+d){
                            System.out.println("Su numero es split");
                        }else {
                            System.out.println("Su numero no es split");
                        }
                    }
                }
            }
        }else {
            System.out.println("Debe ingresar un numero de al menos 2 digitos");
        }
        
    }
    
}
