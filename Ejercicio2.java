import java.util.Scanner;
public class Ejercicio2{

    
    public static void main(String[] args) {
        int n1;
        int n2;
        int suma =0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero:");
        n1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        n2 = sc.nextInt();
        suma = n1 + n2;
        
        if(suma%n1==0 && suma%n2==0){
            System.out.println("El numero "+suma+ " es perfecto");
                       
        }
        else{
            System.out.println("El numero "+suma +" no es perfecto");
        }
					
	
    }
        
                       
}