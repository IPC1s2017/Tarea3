public class NumeroPalindromo{
	public static void main(String[]args){
		Long palindromo = 0l;
		for(Long k=100l; k<1000; k++){
			for(Long s=100l; s<1000; s++){
				Long multi = k*s; String multiLetra = multi.toString();
				StringBuilder espali = new StringBuilder(multiLetra);
				espali =espali.reverse();
				if(multiLetra.equalsIgnoreCase( espali.toString())){
					if(palindromo<multi){
						palindromo=multi;
					}
				}
			}
		}

		System.out.println("Numero Palindromo mayor\nFormado por 2 numeros de 3 digitos es:" +palindromo);
	}
}