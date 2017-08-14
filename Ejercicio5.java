
public class Ejercicio5{
	
	public static void main(String[]args){
	int producto=0;
	int residuo=0;
	
	int entero=0;

	for(int n=100;n<=999;n++){
		for(int i=100;i<=999;i++){
			producto=n*i;
			entero=producto;
                       
                        int inverso=0;
			while(entero>0){
			residuo=entero%10;
                        entero=entero/10;
                        inverso=inverso*10+residuo;
                        
                        }
			if (producto==inverso){
			
                        System.out.println("Y los numeros son: "+n+" y "+i);
                        System.out.println("El producto es "+producto+" y el inverso es "+ inverso);
			}
                      
			
		}
	}
}
}