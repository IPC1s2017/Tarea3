public class Ejercicio4{

	public static void main(String[] args) {
		int suma=0;
		int contador=3;
		for (contador=3;contador<1000; contador++ ) {
				if (contador%3==0 || contador%5==0) {
					suma=suma+contador;
				}
		}
		System.out.println(suma);	
	}
}