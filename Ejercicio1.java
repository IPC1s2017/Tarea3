public class Ejercicio1 {

    public static void main(String args[]) {
        int[] valido = new int[1000];
        int falta, inv, resto;
        int mayor = 0;
        for (int i = 100; i < valido.length; i++) {
            int numero = i * i;

            for (int j = 100; j < valido.length; j++) {
                int num2 = j * j;

                falta = numero;
                inv = 0;
                resto = 0;

                //este es el que da la vuelta al numero
                while (falta != 0) {
                    resto = falta % 10;
                    inv = inv * 10 + resto;
                    falta = falta / 10;
                }

                for (int x = 0; x < 1; x++) {
                    if (num2 == inv) {
                        if (numero != num2) {
                            valido[x] = numero;
                            System.out.println(i+" X "+i+ " = "+numero);
                            System.out.println(j+" X "+j+ " = "+inv);
                            System.out.println("+++++++++++++++++++++++");
                        }
                    }
                }
            }
        }
    }
}