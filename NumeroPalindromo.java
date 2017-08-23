public class NumeroPalindromo {
    public static void main(String args[]){
    
    
    
        Long nPalindromo=0l;
        for (Long i = 100l; i < 1000; i++) {
           for (Long j = 100l; j < 1000; j++) {
                Long numero = i*j; String buscador = numero.toString();
                StringBuilder inverso = new StringBuilder(buscador);
                inverso = inverso.reverse();
				if (buscador.equalsIgnoreCase(inverso.toString())) {
					if (nPalindromo<numero) {
                        nPalindromo=numero;
                    }
                }
            }
        }
        System.out.println("El numero encontrado fue: "+ nPalindromo);
        
    }
}
  
