public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Numero palindromo formado por el producto de dos numeros de tres digitos");
      for (int i = 100; i <=999 ; i++) {
        int snum=0;
        int mul=0;
        int contador=0;
            while (snum <= 999) { 
            snum= i+contador;
            mul = i * snum;
            contador= contador +1;
            int resto_div=0;
            int div_entera= mul;
            int num_inv=0;
                while (div_entera != 0) { 
                resto_div = div_entera % 10; 
                div_entera = div_entera / 10; 
                num_inv = num_inv * 10 + resto_div; 
} 
                   if (mul== num_inv & mul > 900000){System.out.println("Primer Numero:" + i);System.out.println("Segundo Numero:" + snum);}
} 
           
            

    }
}
  }  