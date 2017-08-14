import java.util.Scanner;
public class Ejercicio2{


	public static void main(String[] args) {
		
       int suma;
	   int n;
       Scanner s = new Scanner(System.in);

		System.out.println("Ingrese un numero");
		n = s.nextInt();
		suma = 0;

		for(int d=1; d<n; d++){

		if(n%d==0){
			suma = suma+d;
                     System.out.println("Divisor: "+d);
		}
                
                /*else{
			System.out.println("Este numero no es divisor de: "+n);
		}*/
                }
		System.out.println("Suma divisores: "+suma);
		if(n == suma){
			System.out.println("El numero ingresado SI es perfecto");
		}
		else{
			System.out.println("El numero ingresado NO es perfecto");
		}
	}
}