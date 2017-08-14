

public class Palindromo {
    public static void main(String args[]){
    
    
    
        Long palindromo=0l;
        for (Long i = 100l; i < 1000; i++) {
           for (Long k = 100l; k < 1000; k++) {
                Long entero = i*k; String multiLetra = entero.toString();
                StringBuilder inverso = new StringBuilder(multiLetra);
                inverso = inverso.reverse();
        if (multiLetra.equalsIgnoreCase(inverso.toString())) {
        if (palindromo<entero) {
                        palindromo=entero;
                    }
                }
            }
        }
        System.out.println(palindromo);
        System.out.println("Numero palindromo mayor formado por el producto de dos numeros de 3 digitos");
    }
}
  
