import java.util.Scanner;
/*Determina si el número ingresado es perfecto o no lo es*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P_num, P_sum = 0, i = 2, P_aux;
      
        System.out.println("Ingrese un numero entero positivo");
        P_num = in.nextInt();

        P_aux = P_num/i;
        //Primero obtiene los múltiplos del número ingresado
        //Luego lleva la suma de esos múltiplos
        while ( P_aux >= 1 ){
            if ( (P_num%i) == 0 ) {
                P_sum +=  P_aux;
            }
            i++;
            P_aux = P_num/i;
        }
        
        if (P_sum == P_num) {
            System.out.println("El numero ingresado es perfecto");
        } else {
            System.out.println("El numero ingresado no es perfecto");
        }
    }
}