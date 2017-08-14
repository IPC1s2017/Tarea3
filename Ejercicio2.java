

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner Registro = new Scanner(System.in);

        System.out.println("Introdusca el numero");
        int N = Registro.nextInt();

        int tem = 0;
        int Val;
        for (int i = 1; i < N; i++) {

            if (N % i == 0) {
                Val = tem + i;
                tem = Val;

            }

        }

        if (N == tem) {
            System.out.println(N + " es perfecto");
        } else {
            System.out.println(N + " No es perfecto");
        }

    }

}
