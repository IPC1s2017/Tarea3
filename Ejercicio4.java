
public class Ejercicio4{
	public static void main(String[]args){
	int suma=0;
	for(int i=3;i<=999;i++){
		if (i%3==0 || i%5==0){
			suma=suma+i;
		}
	}
	System.out.println("La suma total es "+suma);
	}
}