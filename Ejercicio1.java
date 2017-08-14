public class Ejercicio1 {

    public static void main(String[] args) {
   
        System.out.println("Bienvenido te dare los numeros  que sus cuadrados  tiene relacion con sus inversos y sus cuadrados;");
        System.out.println("");

        int numero = 1000;
        int b, d, g, A, B, C, D;
        int tot1 = 0, tot2 = 0;

        for (int i = 100; i < numero; i++) {

            A = i / 100;
            B = i - (A * 100);
            C = B / 10;
            D = B - (C * 10);

            g = (D * 100) + (C * 10) + A;

            int G = g * g;
            int I = i * i;


            int cenmil = G / 100000;
            b = G - (cenmil * 100000);

            int decmil = b / 10000;
            d = b - (decmil * 10000);

            int unmil = d / 1000;
            int f = d - (unmil * 1000);

            int cen = f / 100;
            int h = f - (cen * 100);

            int dec = h / 10;
            int l = h - (dec * 10);

            int uni = l;

            int cenmil1 = I / 100000;
            int q = I - (cenmil1 * 100000);

            int decmil1 = q / 10000;
            int p = q - (decmil1 * 10000);

            int unmil1 = p / 1000;
            int F = p - (unmil1 * 1000);

            int cen1 = F / 100;
            int H = F - (cen1 * 100);

            int dec1 = H / 10;
            int L = H - (dec1 * 10);

            int uni1 = L;


            if (uni1 == decmil && dec1 == unmil && cen1 == cen && unmil1 == dec && decmil1 == uni || uni1 == cenmil && dec1 == decmil && cen1 == unmil && unmil1 == cen && decmil1 == dec && cenmil1 == uni) {

                tot1 = I;
                tot2 = G;

                System.out.println(g + "*" + g + "=" + tot2 + ":::::::::" + i + "*" + i + "=" + tot1);

                
            }

          
        }

    }

}
