import java.util.Scanner;
public class Caracteristica {
	public static void main(String[] args){
		int res = 0;
		int entero;
		int n;
		int inverso = 0;
		int p;
		int z;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		entero = entrada.nextInt();
		n = entero;
		while(n!=0){

			res = n%10;
			n = n/10;
			inverso = inverso*10+res;

		}

		p = inverso*inverso;
		z = entero*entero;
		n= z;
		int inver = 0;
		res = 0;

		while(n!=0){
			res = n%10;
			n = n/10;
			inver = inver*10+ res;
		}
		
		if(p == inver){
			System.out.println("Exito");
		}else{
			System.out.println("Sin exito");
		}


	}
}