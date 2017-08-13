public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Caracteristicas entre numeros de tres digitos :");
        for (int i=100; i<=999; i++ ){
        int m = i * i;
        int resto_div=0;
        int div_entera= i;
        int num_inv=0;
 while (div_entera != 0) { 
     resto_div = div_entera % 10; 
     div_entera = div_entera / 10; 
     num_inv = num_inv * 10 + resto_div; 
} 
        int m2=num_inv*num_inv;
        int resto_div2=0;
        int div_entera2= m2;
        int num_inv2=0;
 while (div_entera2 != 0) { 
     resto_div2 = div_entera2 % 10; 
     div_entera2 = div_entera2 / 10; 
     num_inv2 = num_inv2 * 10 + resto_div2; 
} 
        if (m==num_inv2){System.out.println("Numero:" + i );}
        
        
       }
        }
    }

