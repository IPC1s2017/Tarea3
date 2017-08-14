import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String Args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero = sc.nextInt();
        int suma = 0;
        int divisor;
        for(divisor =1; divisor<numero; divisor++){
            if(numero%divisor==0){
                suma = suma + divisor;
            }
        }
        System.out.println("la suma de los divisores es: "+suma);
        if(suma == numero){
            System.out.println("=============================================");
            System.out.println("+        el numero: " +numero+ " es perfecto          +");
            System.out.println("=============================================");
        }else{
            System.out.println("=============================================");
            System.out.println("+       el numero: " +numero+ " no es perfecto        +");
            System.out.println("=============================================");
        }
    }
}