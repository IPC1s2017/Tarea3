
public class Ejercicio4 {

    public static void main(String[] args) {
        int Suma=0;
        for(int i=3;i<=999;i++){
            
            if(i%3==0 || i%5==0){

                Suma=Suma+i;
            }
        
        }
        System.out.println("La suma de los multiplos es "+ Suma+" del 0 al 999");
    }
    
}
