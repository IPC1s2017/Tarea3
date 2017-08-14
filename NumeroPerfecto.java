import java.util.Scanner;
public class NumeroPerfecto {
	public static void main(String[] args){
		int i, suma =0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		n= sc.nextInt();
		for(i=1; i<n; i++){
			if(n%i==0){
				suma= suma+i;
			}
		}
		if(suma== n){
			System.out.println("Numero Perfecto");
		} else{
			System.out.println("No es Perfecto");
		}
	}
}