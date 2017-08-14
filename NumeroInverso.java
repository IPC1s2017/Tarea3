import java.util.Scanner;
public class NumeroInverso {
    public static void main(String args[]){
		int inicio= 0;
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad 1: ");
        inicio = sc.nextInt();
		System.out.println("Ingrese cantidad 2: ");
        n = sc.nextInt();
		for (int i = 100; i<1000; i++) {
			int residuo = 0;
			int entero = i;
			int inverso = 0;
			while(entero !=0){
				residuo = entero%10;
				entero = entero/10;
				inverso= inverso*10 + residuo;
			}
			n = inverso*inverso;
			inicio = i*i;
			entero = inicio;
			int a = 0;
			residuo = 0;
			while (entero !=0){
				residuo = entero%10;
				entero = entero/10;
				inverso= inverso*10 + residuo;			
			}
			if(n == a){
				System.out.println(n);
			}
			
		}
		
		
		
	}		
    
}
  
