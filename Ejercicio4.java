public class Ejercicio4 {
public static void main(String[] args) {
    int n1=3;
    int n2=5;
    int suma=0;
    int suma2=0;
    System.out.println("Suma de los multiplos de 3 y 5 menores de 1000");
        for (int i=0; i<1000; i++ ){
    if (i % n1 == 0)
            {
              suma= suma + i; 
            }
     if (i % n2 == 0)
            {
              suma2= suma2 + i;
            }
} 
        int total=suma+suma2;
        System.out.println("Resultado:" + total);
        
       }
        }