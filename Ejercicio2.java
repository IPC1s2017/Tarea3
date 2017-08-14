
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner num=new Scanner (System.in);
        System.out.println("ingrese un numero entero :");
        int d= num.nextInt();
        int z = 0;
        for (int i = 1; i < d; i++) {
        if(d%i==0){
        z=z+i;
        }    
        
        }
        if (z==d) {
            System.out.println("el numero "+d+" es perfecto");
            
        } else {
            System.out.println("el numero "+d+" no es perfecto");
        }
        
        
    }
    
}
