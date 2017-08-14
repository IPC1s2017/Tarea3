package multiplos;

public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;

        for (int i=1; i<=999; i++){
            if ((i% 3==0)|| (i% 5==0)){
                suma=suma+i;
            } else {
                suma=suma+0;
            }
        }
         System.out.println("La suma de los multiplos de 3 y 5, de 1-999 es: "+suma);
        
        
    }
    
}
