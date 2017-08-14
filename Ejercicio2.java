
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[]args){
		Scanner lector=new Scanner(System.in);
		int sum=0;
		int res=0;

		System.out.println("Ingrese un numero");
		int n= lector.nextInt();

		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println("El numero ingresado es perfecto");
		}else{
			System.out.println("El numero ingresado no es perfecto");
		}

	}
}