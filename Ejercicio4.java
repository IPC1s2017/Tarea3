public class Ejercicio4{

	public static void main(String[] args) {
		
		int suma=0;

		for(int i=5; i<1000; i=i+5){
			for(int j=3; j<1000; j=j+3){

			suma = suma + i + j;
			
			}
		}
		System.out.println("La suma de los multiplos de 3 y 5 es: "+suma);

	}
}