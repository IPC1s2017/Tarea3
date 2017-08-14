public class problema2 {
	public static void main(String args[]) 
		double c;
		double d;
		double n;
		double s;
		n = 0;
		s = 0;
		c = 0;
		d = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println ("Escriba un numero para determinar si es perfecto: ");
		n = teclado.nextInt();
		c = n;
		d = n;
		while (c>1) {
			d = d-1;
			if (n%d==0) {
				s = s+d;
				c = c-1;
			} 
			else {
				c = c-1;
			}
		}
		if (n==s) {
			System.out.println("es un numero Perfecto");
		} else {
			System.out.println("No es un numero perfecto");
		}
	}

