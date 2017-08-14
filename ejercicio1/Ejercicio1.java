
package ejercicio1;

public class Ejercicio1 {
     public static void main(String[] args) {
        
       int Suma = 0;
                    
       for( int n= 3; n<1000; n++){
           if(n%3==0 || n%5==0){
               Suma = Suma + n;
           }
       }
        System.out.println(Suma);
       
    }
    
}
