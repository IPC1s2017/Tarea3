import java.util.Scanner;
public class Ejercicio3{
	
	public static void main(String[] args){
		int numero;
		int residuo;
		int contador =0;
		int inverso;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		
		while(numero !=0 );{
			residuo = numero%10;
			numero = numero/10;
			inverso= inverso *10 +residuo;
			contador = contador +1;
		}
		
		if(contador%2 ==0 ){
			repeticiones = contador /2;
			
		}
		else{
			repeticiones = contador /2 +1;
		}
		
		for(int i =0; i<repeticiones; i++){
			residuo = numero2%10;
			numero2 = numero/10;
			inverso2 = inverso2*10+residuo;
			suma = suma +residuo;
			
		}
		for(int i =0; i < repeticiones; i++){
			residuo2 = inverso%10;
			inverso = inverso/10;
			inverso3 = inverso3 *10+ residuo2;
			suma2 = suma2 +residuo2;
			
		}
		if()suma == suma2){
			System.out.println("El numero ingresado es Split");
		}
		else{
			System.out.println("El numero ingresado no es Split");
		}
		
	}
}