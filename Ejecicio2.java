import java.util.Scanner;
public class Ejecicio2{
	public static void main(String[] args) {
		int num=0;
		int suma=0;
		int num2=0;
		Scanner in= new Scanner(System.in);
		System.out.println("ingrese un numero");
		num=in.nextInt();
		num2=num-1;
		for (int i=1;i<=num2 ;i++ ) {
			if (num%i==0) {
				suma=suma+i;
			}
		}
		System.out.println(suma);
		if (suma==num) {
			System.out.println("EL numero "+num+" es perfecto");
		}
		else{
			System.out.println("EL numero "+num+" no es perfecto");
		}
	}
}