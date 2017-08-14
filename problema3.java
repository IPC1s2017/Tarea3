public class problema3 
	{
	public static void main(String args[]) {
		int num;
		double res;
		int check;
		double digit;
		double digit2;
		double valor;
		int contador;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("ingrese un numero: ");
		num = teclado.nextInt();
		valor = num;
		while num > 0 {
			num = num / 10;
			contador = contador + 1;
		}
		if contador % 2 = 0 {
			for check = 1 to (contador/2), check ++ {
				res = valor % 10;
				valor = valor / 10;
				digit = digit + res;
			}
			for check = 1 to (contador/2), check ++ {
				res = valor % 10;
				valor = valor / 10;
				digit2 = digit2 + res;
			}
		} else {	
			for check = 1 to ((contador-1)/2), check ++ {
				res = valor % 10;
				valor = valor / 10;
				digit = digit + res;
			}
			digit2 = res
			for check = 1 to ((contador-1)/2), check ++ {
				res = valor % 10;
				valor = valor / 10;
				digit2 = digit2 + res;
			}
		}
		if digit = digit2 {
			System.out.println("es un numero split");

		}else {
			System.out.println("no es un numero split");
		}
	}
}