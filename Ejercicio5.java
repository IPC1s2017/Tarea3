public class Ejercicio5{
	public static void main(String[] args) {
	    int numero1;
     	numero1=999;
     	int numero2;
     	numero2=999;
     	int resultado1;
     	int inverso;
     	inverso=0;
     	int residuo;
     	int entero1;
        while (numero2==0) {            
            while (numero1==999) {            
            resultado1 = numero1*numero2;
            entero1=resultado1;
            while (entero1!=0) {                
                residuo=entero1%10;
                entero1=entero1/10;
                inverso=inverso*10+residuo;
            }
            if(resultado1==inverso){
                System.out.println(numero1);
                System.out.println(numero2);
            }
            numero1=numero1+1;
            }
            numero2=numero2-1;
        }
	}
}