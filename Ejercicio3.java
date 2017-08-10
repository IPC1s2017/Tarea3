import java.util.Scanner;
/*Determina si el número ingresado es split o no lo es*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S_num01, S_aux01, S_aux02 = 0, S_aux03 = 0, S_dig01, S_dig02 = 0, S_dig03, S_cont01 = 0, S_exp01, S_sum01 = 0, S_sum02 = 0;
        
        System.out.println("Ingrese un numero entero positivo");
        S_num01 = in.nextInt();
        S_aux01 = S_num01;
        //Para llevar el conteo de cuántos digitos tiene el número ingresado,
        //se lleva la cuenta del número de veces que corrió el ciclo
        //La cuenta se guarda en S_cont01
        while (S_num01 > 0){
            S_dig01 = S_num01 % 10;
            S_num01 = (S_num01 - S_dig01)/10;
            S_cont01++;
        }
        
        if ( (S_cont01%2) != 0 ){
            //Separa los digitos del 1era mitad del numero ingresado, (los separa teniendo en cuenta la definicion de Base 10)
            //y luego lleva la suma de ellos            
            //En este ciclo sí se suma el número de "en medio"
            //Por último guarda el número de veces que corrió el ciclo
            for (int i = 1; i <= ((S_cont01/2) + 1); i++){
                S_exp01 = (int) Math.pow(10,S_cont01-i);
                S_dig02 = S_aux01/S_exp01;
                S_aux01 -= S_dig02*S_exp01;
                S_sum01 += S_dig02;
                S_aux03 = i; 
            }
            S_dig03 = S_dig02;/*S_dig02 guarda el valor de "en medio"*/
            //Realiza mas o menos el mismo procedimiento que el ciclo anterior pero con la 2da mitad del número
            //En la suma de este ciclo se excluye el numero de "en medio" <- esto se arregla al final del ciclo
            //Aqui no se guarda el número de veces que corrió el ciclo
            for (int j = S_aux03; j <= S_cont01; j++){
                S_exp01 = (int) Math.pow(10,S_cont01-j);
                S_dig02 = S_aux01/S_exp01;
                S_aux01 -= S_dig02*S_exp01;
                S_aux02 += S_dig02;
            } 
            S_sum02 = S_aux02 + S_dig03; /*<-Aquí se arregla*/
        } else {
            //En los sig. ciclos se realizan los mismos procedimientos que en los 2 primeros
            //Ya que es par no existe el problema del numero de "en medio", el resto es igual a los anteriores ciclos
            for (int i = 1; i <= (S_cont01/2); i++){
                S_exp01 = (int) Math.pow(10,S_cont01-i);
                S_dig02 = S_aux01/S_exp01;
                S_aux01 -= S_dig02*S_exp01;
                S_sum01 += S_dig02;
                S_aux03 = i;
            }
            for (int j = S_aux03; j <= S_cont01; j++){
                S_exp01 = (int) Math.pow(10,S_cont01-j);
                S_dig02 = S_aux01/S_exp01;
                S_aux01 -= S_dig02*S_exp01;
                S_sum02 += S_dig02;
            }
        }
        //El momento de la verdad
        if (S_sum01 == S_sum02){
            System.out.println("Ya que " + S_sum01 + "=" + S_sum02 + ". El número es Split");
        } else {
            System.out.println("Ya que " + S_sum01 + "!=" + S_sum02 + ". El número no es Split");
        }
    }
}