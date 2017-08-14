public class problema4 {
	public static void main(String args[]) {
		double c;
		int s;
		s = 0;
		c = 1000;
		while (c>0) {
			if (c%5==0) {
				s = s+c;
				c = c-1;
			} else {
				if (c%3==0) {
					s = s+c;
					c = c-1;
				} else {
					c = c-1;
				}
			}
		}
		System.out.println("Suma de los multiplos: "+s);
	}
}

