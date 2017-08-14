import java.util.Scanner;
public class Split{
	public static void main(String[]args){
		int cantdigi = 0;
		int suma = 0;
		int numero;
		int suma2;
		int cambio;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		numero = entrada.nextInt();
		cambio = numero;
		while(numero>=1){
			numero = numero/10;
			cantdigi = cantdigi+1;
		}
		System.out.println("cantidad de digitos es:"+cantdigi);
		suma2 = cambio+cantdigi;
		System.out.println("La suma es :"+suma2);
		cantdigi = cantdigi%2;
		if(cantdigi==0){
			System.out.println("cantidad es:"+cantdigi);
		}else{
			System.out.println("es:"+cantdigi);
		}

	}
	
}