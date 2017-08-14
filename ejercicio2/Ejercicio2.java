package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
        
       int Suma = 0;
       int Num=0;
       int Cont=1;
       int i=0
                Scanner LEER = new Scanner(System.in);
       System.out.println("Ingresar un número");
       
       Num = LEER.nextInt();
       
        if(Num>0){
           for(int Cont<Num;
                   Cont++;){
               if(Num%Cont == 0){
                   Suma = Suma + Cont;
               }
           }

           if(Suma == Num){
               System.out.println("El número " +Num+ " es un número perfecto");
           }else{
               System.out.println("El número " +Num+ " no es un número perfecto, intentar nuevamente");
           }
        }else{
            System.out.println("El numero " +Num+ " no es un numero perfecto, intentar nuevamente");
        }
    }
}

}
