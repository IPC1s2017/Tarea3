import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
       int total=0;
       int divisores=1;
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese su valor");
       int valor=leer.nextInt();
      while(divisores<=(valor/2)){
          if(valor%divisores==0){
              total=total+divisores;
              divisores++;
          }
          else{
          divisores++;
          }
      }
      if(total==valor){
      System.out.println("Es un numero perfecto");
      }
      else{
      System.out.println("No es un numero perfecto");
      }
    }
    
}
