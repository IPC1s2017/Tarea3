public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Bienvenido; te dare la sumatoria de todos los multiplos de 3 y 5 de 0 a 1000 ");
        System.out.println("");

        int N = 1000;
        int Valor = 0;
        int Valor2 = 0;

        for (int i = 0; i < N; i++) {

            if (i % 3 == 0) {
                Valor2 = Valor2 + i;

            } else {
                if (i % 5 == 0) {

                    Valor = Valor + i;
                }
            }

        }
        System.out.println("************_La suma es : " + (Valor + Valor2) + "_************");

    }

}
