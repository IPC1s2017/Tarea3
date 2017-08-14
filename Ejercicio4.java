public class Ejercicio4 {

    public static void main(String[] args) {
        int total = 0;
        for (int a = 0; a < 1000; a++) {
            if (a % 3 == 0) {
                total = total + a;

            } else if (a % 5 == 0) {
                total = total + a;

            }
        }
        System.out.println("La suma de los multiplos es: " + total);
    }

}