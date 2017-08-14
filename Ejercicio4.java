public class Ejercicio4 {
    
    public Ejercicio4(){
        calculando();
    }
    
    private void calculando(){
        int i;
        int suma=0;
        
        for(i=3;i<=999;i++){
            if(i%3==0 || i%5==0){
                suma = suma+i;
            }
        }
        System.out.println(suma);
    }
}