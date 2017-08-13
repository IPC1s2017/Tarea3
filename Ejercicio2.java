

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("hola es el Ejercicio numero 2");
        System.out.println("Numero Perfecto");
        System.out.println("Ingrese un numero Por favor");
        int n =0;
        int perfecto = 0;
        n= entrada.nextInt();
        for(int i=1;i<n;i++){
           
            if(n%i==0){
                perfecto=perfecto+i;
            }
        
        }
        if(perfecto==n){
            System.out.println("Su numero es perfecto "+perfecto);
        }
        else{
            System.out.println("Su numero no es perfecto " +n+":(");
        }
    }
    
}
