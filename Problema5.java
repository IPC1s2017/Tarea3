public class problema5 {
	public static void main(String args[]) {
		double c;
		double e;
		double i;
		double m;
		double r;
		double s;
		double x;
		x = 999;
		c = 999;
		s = 0;
		e = 0;
		i = 0;
		r = 0;
		m = 0;
		while (x>1) {
			s = c*x;
			m = c*x;
			while (c>1) {
				s = c*x;
				m = c*x;
				while (s!=0) {
					r = s%10;
					s = s/10;
					i = i*10+r;
				}
				c = c-1;
				if (i==m) {
					x = 0;
					c = 0;
				}
			}
			x = x-1;
			c = 999;
		}
		System.out.println("los numeros son: "+ x " y " + c);
		System.out.println("el resultado es: " s);
	}


}

