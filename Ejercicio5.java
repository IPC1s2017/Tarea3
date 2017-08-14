public class Ejercicio5{

	public static void main(String[] args) {
	
		Long palindro=0l;
        for (Long i = 100l; i < 1000; i++) {
            for (Long j = 100l; j < 1000; j++) {
                Long multiplicacion = i*j; String letra = multiplicacion.toString();
                StringBuilder cadena = new StringBuilder(letra);
                cadena = cadena.reverse();
                if (letra.equalsIgnoreCase(cadena.toString())) {
                    if (palindro<multiplicacion) {
                        palindro=multiplicacion;
                    }
                }
            }
        }
        System.out.println("El palindromo mayor formado por el producto de 2 numeros de 3 digitos es: "+palindro);
   	
	}
}