public class Ejercicio1 {
    
    public Ejercicio1(){
        
        calculando();
    }
    private void calculando(){
        
        int i;
        for(i=100; i<=999; i++) {
            
            int primernumero=i*i;
            int segundonumero=VoltearNumero(i)*VoltearNumero(i);
            if (VoltearNumero(primernumero)==segundonumero) {
                System.out.println(i+"*"+i+"="+primernumero);
                System.out.println(VoltearNumero(i)+"*"+VoltearNumero(i)+"="+segundonumero+"\n");
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