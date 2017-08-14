public class Multiplos3y5{
	public static void main(String[]args){
		int sum = 0;
		int sum2 = 0;
		int sum3;
		String cad = "";
		String cad2 = "";
		System.out.println("Multiplos de 5");
		for(int p=0; p<=1000; p=p+5){
			cad= cad+" "+p;
			sum = sum + p;

		}

		System.out.println(cad);
		System.out.println("Multiplos de 3");
		for(int k=0; k<=1000; k=k+3){
			cad2 = cad2+" "+k;
			sum2 = sum2+k;
		}
		System.out.println(cad2);
		System.out.println(sum2);

		sum3 = sum+sum2;
		System.out.println("La suma de multiplos es:"+sum3);
	}
}