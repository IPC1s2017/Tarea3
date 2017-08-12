public class Ejercicio1{
	public static void main(String[] args) {
		int resultado1;
		int resultado2;
		int inverso1=0;
		int inverso2=0;
		int entero1;
		int entero2;
		int enteroR1;
		int residuo1;
		int residuoR1;

		for (int n1=100;n1<=999 ;n1++ ) {
			resultado1=n1*n1;
			resultado2=inverso1*inverso1;
			entero1=n1;
			entero2=inverso1*inverso1;
			while (entero1!=0) {
				residuo1=entero1%10;
				entero1=entero1/10;
				inverso1=inverso1*10+residuo1;
			}
			while (entero2!=0) {
				residuoR1=entero2%10;
				entero2=entero2/10;
				inverso2=inverso2*10+residuoR1;
			}
			if (inverso2==resultado1) {
				System.out.println(n1);
			}
		}
	}
}

