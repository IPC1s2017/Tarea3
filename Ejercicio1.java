/*Encuentra todos los numeros de tres digitos
para los cuales el cuadrado de su inverso sea igual 
al inverso de su cuadrado*/
public class Ejercicio1 {  
    public static void main(String[] args) {
        int numUno, revUno = 0, digUno, numDos, revDos = 0, auxUno, auxDos, digDos;
        
        System.out.println("Listado de numeros caracteristica de tres digitos: ");
        
        for (int i = 100; i <= 999 ; i++ ) {
            numUno = i;
            //Voltea numUno (i)
            while (numUno > 0){
                digUno = numUno%10;
                numUno = (numUno - digUno)/10;
                revUno = revUno*10 + digUno;
            }

            numDos =(int) Math.pow(i,2);
            auxUno = numDos;
            auxDos = (int) Math.pow(revUno,2);
            //Voltea numDos (el cuadrado de i)
            while (numDos > 0){
                digDos = numDos%10;
                numDos = (numDos - digDos)/10;
                revDos = revDos*10 + digDos;
            }

            if (revDos == auxDos) {
                System.out.println( i + "^2= " + auxUno + " y " + revUno + "^2= " + auxDos);
            }
            //Ambas variables se "limpian" para evitar errores de arrastre
            revUno = 0;
            revDos = 0;
        }
    }
}
