/*Encuentra el número palíndromo mayor formado por
el producto de 2 número de 3 dígitos*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int P_cte01 = 999, P_rev01 = 0, P_rev02 = 0, P_dig01 = 0, P_dig02 = 0, P_aux01, P_aux02, P_aux03, P_pal01, P_pal02;
        //El ciclo va multiplicando 999*999, 999*998 y así
        //Y al mismo tiempo va elevando al cuadrado : 999^2, 998^2 y así
        //Voltea los resultados de cada iteracion en ciclos separados
        //El ciclo (for) se detiene inmediatamente cuando la condicion (if) se cumple
        for (int i = 0; i <= P_cte01 ; i++) {
            P_aux01 = P_cte01 - i;
            P_pal01 = P_cte01*P_aux01;
            P_pal02 = (int) Math.pow(P_aux01,2);
            P_aux02 = P_pal01;
            P_aux03 = P_pal02;
            
            while ( P_pal01 > 0 ) {
                P_dig01 = P_pal01%10;
                P_pal01 = (P_pal01 - P_dig01)/10;
                P_rev01 = P_rev01*10 + P_dig01;
            }
            
            while ( P_pal02 > 0 ) {
                P_dig02 = P_pal02%10;
                P_pal02 = (P_pal02 - P_dig02)/10;
                P_rev02 = P_rev02*10 + P_dig02;
            }

            if ( P_rev01 == P_aux02 ) {
                System.out.println("Palindromo encontrado: " + P_cte01 + " x " + P_aux01 + " = " + P_aux02);
                break;
            } else {
                if ( P_rev02 == P_aux03 ) {
                    System.out.println("Palindromo encontrado: " + P_aux01 + "^2 = " + P_aux03);
                    break;
                }
            }
            //Ambas variables se "limpian" para evitar errores de arrastre
            P_rev01 = 0;
            P_rev02 = 0;   
        }
    }
}
