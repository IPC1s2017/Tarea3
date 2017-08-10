/*Calcula la suma de de todos los números 
naturales múltiplos de 3 y 5, debajo de 1000*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int M_cte01 = 999,M_sum01 = 0, M_cont01 = 0;
        
        while ( (M_cte01 - M_cont01)!=0 ){
            if ((M_cte01 - M_cont01)%5==0){
                M_sum01 += (M_cte01 - M_cont01);
            } else {
                if ((999 - M_cont01)%3==0) {
                    M_sum01 += (M_cte01 - M_cont01);
                }
            }
            M_cont01++;
        }
        
        System.out.println("Suma de múltiplos de 3 y 5 : "+ M_sum01);
    } 
}
