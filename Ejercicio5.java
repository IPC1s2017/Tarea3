public class Ejercicio5 {

    public static void main(String[] args) {

        int N3 = 0;

        int N6 = 0;
        
        int a = 0,b,c = 0,d,e = 0,f,g = 0,h,k = 0,l,m = 0,N7 = 906609;
        


        for (int i = 910000; i > 900000; i--) {
                    //cenml
             a = i / 100000;
             b = i - (a * 100000);
            //decemil
             c = b / 10000;
             d = b - (c * 10000);
            //unidadmil
             e = d / 1000;
             f = d - (e * 1000);
            //centena
             g = f / 100;
             h = f - (g * 100);
            //decena
             k = h / 10;
             l = h - (k * 10);
            //unidad
             m = l;
             
             N6 = i;
        }
        
           if (a == m && c == k && e == g) {
             N7 = N6;

            }

        for (int N1 = 900; N1 < 999; N1++) {

            for (int N2 = 900; N2 < 999; N2++) {

                N3 = N2 * N1;


                        if (N3 == N7) {
                    System.out.println(  N2+"*"+N1+"=" + N7);

                    break;
                }
            }

        }
        


    }

}