public class Ejercicio5 {
    
    public Ejercicio5(){
        calculando();
    }
    
    private void calculando(){
        int i;
        int j;
        int primernumero;
        for(i=999;i>100;i--){
            for(j=999;j>100;j--){
                
                primernumero=i*j;
                
                if(primernumero==VoltearNumero(primernumero)){
                    System.out.println("El producto palincromo mayor de numerales de 3 digitos es: "+i+"*"+j+"="+primernumero+"\n");
                    j=100;
                    i=100;
                }
            }
            
        }
    }
    /*private int VoltearNumero(int n ){
        
        int entero = n;
        int residuo=0;
        int inverso=0;
        while(entero!=0){
            
            residuo = entero%10;
            entero = entero/10;
            inverso = inverso * 10 + residuo;
        }
    return inverso;
    
    }*/
    
    private int VoltearNumero(int n) { 
        
        int num = 0; 

        while(n > 0) { 
        num = num*10 + n%10; 
        n /= 10; 
        } 
    return num; 
    }
}
