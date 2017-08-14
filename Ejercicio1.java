public class Ejercicio1{

	public static void main(String[] args) {
		int a=0;
	int n;	
        

		for(int i=100; i<=999; i++){
			int residuo = 0;
			int entero = i;
			int inverso = 0;

			while(entero!=0){
					residuo = entero%10;
					entero = entero/10;
					inverso = inverso*10 + residuo;
			}
                         
                            
                    n = inverso*inverso;
                    a = i*i;
                    entero = a;
                    int inverso1 = 0;
                    residuo = 0;
  
                    while(entero!=0){
                    	residuo = entero%10;
                    	entero = entero/10;
                    	inverso1 = inverso1*10 + residuo;
                    }
                      
                     if(n == inverso1){
                    	System.out.println("Numero: "+i);
                        System.out.println("Inverso del numero: "+inverso);
                        System.out.println("Multiplicacion del numero: "+a);
                        System.out.println("Inverso de la multiplicacion: "+inverso1);
                        System.out.println(" ");
 
                    }
                   else{
                    	
                    }
				 

                    	
                    
				} 


			}
		}
