import java.util.Scanner;

public class Ejercicio3 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su valor para saber si es Split o no");
        String valor = leer.next();
        String valores[] = valor.split("");
        int lado1 = 0, lado2 = 0;
        for (int a = 0; a < (valores.length / 2); a++) {
            lado1 = lado1 + Integer.parseInt(valores[a]);
            lado2 = lado2 + Integer.parseInt(valores[a + 3]);
        }
        if (lado1 == lado2) {
            System.out.println("Es un numero Split");
        } else {
            System.out.println("No es un numero Split");
        }
    }

}