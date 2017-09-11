import java.util.Scanner;
public class Ejercicio2 {
     public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        System.out.println ("Introduzca un numero entero");
        int n = reader.nextInt();
        System.out.println();
                int suma = 0;
        for (int i = 1 ; i <n ; i++)
        {
            if (n % i == 0)
            {
                suma= suma + i;
            }
            
        }
         if (suma == n){ System.out.println ("El nuumero es perfecto"); }
         else {System.out.println("El numero no es perfecto");}
    }
}