public class Ejercicio5 {

    public static void main(String args[]) {

        int falta, numeroInvertido, resto;
        int mayor = 0;
        int i = 0;
        int j = 0;
        int[] pal = new int[1];
        // int[] arreglo = new int[100];
        for (i = 1; i < 1000; i++) {
            for (j = 1; j < 1000; j++) {
                int numero = j * i;
                //while (numero <= 0);
                falta = numero;
                numeroInvertido = 0;
                resto = 0;

                //el codigo que viene a continuacion da la vuelta al nuemro
                while (falta != 0) {
                    resto = falta % 10;
                    numeroInvertido = numeroInvertido * 10 + resto;
                    falta = falta / 10;
                }
                if (numeroInvertido == numero) {
                    for (int x = 0; x < pal.length; x++) {
                        pal[x] = numero;
                    }
                    mayor = pal[0];
                    for (int y = 1; y < pal.length; y++) {
                        if (mayor < pal[y]) {
                            mayor = pal[y];
                        }
                    }
                }
            }
        }
        System.out.println("el palindromo mayor es " + mayor);
    }

}