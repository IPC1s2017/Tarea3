import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		int suma=0;
		int cont=1;
		int n=0;
		Scanner seleccion = new Scanner(System.in);
		System.out.println("Escribir un Número");
		n=seleccion.nextInt();
		
		while (cont<n) {
			if (n%cont==0) {
				suma=suma+cont;
			}

		cont=cont+1;
		}

		if (n==suma) {
			System.out.println("Este Numero es Perfecto");

		}
		else{
			System.out.println("Este Numero no es Perfecto");
		}

	}
}