package perfecto;

import java.util.Scanner;

public class Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s=0,d=1,n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        n=leer.nextInt();
        while (d<n){
            if (n%d==0){
                s=s+d;
            }
            d=d+1;
        }
        if (s==n){
            System.out.println("Es perfecto");
        }else {
            System.out.println("No es perfecto");
        }
    }
    
}
