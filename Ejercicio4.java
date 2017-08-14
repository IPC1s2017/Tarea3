public class Ejercicio4{
	public static void main(String args[]){
		int i;
		int suma = 0;
		for (i=1; i<1000; i++ ) {
			if(i%3==0 || i%5==0){
				suma = suma + i;
			}
		}
		System.out.println("la suma de los multiplos de 3 y 5 debajo de 1000 es: "+suma);
	}
}