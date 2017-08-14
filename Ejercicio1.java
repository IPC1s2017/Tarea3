import java.util.Scanner;

public class Ejercicio1 {

      public static void main(String[ ] arg) {
     
        String valor;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese su valor");
        valor=leer.next();
        String valores[]=valor.split("");
        String valores2[]=((Integer.parseInt(valor)*Integer.parseInt(valor))+"").split("");
        int sumaValores=0;
        int sumaValores2=0;
        for(int a=0; a<valores.length;a++){
        sumaValores=sumaValores+Integer.parseInt(valores[a]);
        }
        for(int a=0; a<valores2.length;a++){
        sumaValores2=sumaValores2+Integer.parseInt(valores2[a]);
        }
        if((sumaValores*sumaValores)==sumaValores2){
            System.out.println("El numero cumple con la relacion");
        }
        else{
            System.out.println("El numero no cumple con la ralcion");
        }
    }
    
}