import java.util.Scanner;

public class Ejercicio2 {
    
    Scanner scanner;
    int numero;
    
    public Ejercicio2(){
        
        scanner= new Scanner(System.in);
        
        System.out.println("Ingrese el número que desea probar");
        numero = scanner.nextInt();
        
        calculando (numero);
        
    }
    
    private void calculando(int numero){
        int i;
        int suma=0;
        int n = numero;
        
        for (i = 1; i < n; i++) {  
            if (n % i == 0) {
                suma = suma + i;     
            }
        }
        
        if (n==suma){
            System.out.println("Es un número perfecto \n" );      
        }else{            
            System.out.println("No es número perecto \n" );
        }
    }
    
}
