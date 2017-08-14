import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args) {
		int n=0;
		int num=0;
		int num2=0, num3=0,r,j,suma1=0,suma2=0;
		int rec=0;
		int cont=0;
		int cont2=0;
		int p=0;
		int p2=0;
		int sp=0, sp2=0;
		Scanner in= new Scanner(System.in);
		System.out.println("ingrese un numero");
		n= in.nextInt();
		num=n;
		num2=n;
		for (int i=0;i<100;i++ ) {
			num=(int)num;
			rec=num%10;
			num=num/10;
			if (num>0) {
				cont++;
			}
		}
		cont=cont+1;
		p=cont;
		p2=p;
		cont=cont/2;
		System.out.println("aca p "+p);
		if (p%2==0) {
			for (int i=0;i<=100 ;i++ ) {
				num2=(int)num2;
				rec=num2%10;
				num2=num2/10;
				cont2++;
				if (cont2<=cont) {
					sp=sp+rec;
										
				}else{
					sp2=sp2+rec;
				}				
			}
			System.out.println(sp+"    "+sp2);
			if (sp==sp2) {
				System.out.println("El numero ingresado es split");
						
				}else{
				System.out.println("El numero ingresado no es split");
			}	
			
		}else{
			p2=p2-1;
			r=p2/2;
			j=r+1;
			for (int i=1;i<=p ;i++ ) {
				num3=(int)num2;	
				rec=num3%10;
				num2=num2/10;
				if (i<j) {
					suma1=suma1+rec;
				}
				if (i>r) {
					suma2=suma2+rec;
				}
			}
			if (suma1==suma2) {
				System.out.println("El numero ingresado es split");

			}else{
				System.out.println("El numero ingresado no es split");
			}
		}
		//aca fin primer if
	}
}