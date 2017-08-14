public class Ejercicio1{

  public static void main(String []args){
    for (int i=10;i<=31;i++)
    {
      int residuo=i%10;
      int entero=i/10;
      int actual=((residuo*10)+entero);
      int po= actual*actual;
      int valor= i*i;
      {
        if (po <=1000)
         {
           int uno=valor%10;
           int dos=valor/10;
           int tres=dos%10;
           int cuatro=((uno*10)+tres);
           int sinco=dos/10;
           int seis=((cuatro*10)+sinco);
            {
              if (seis==po)
               {
                 System.out.println("Numero que tiene cierta caracteristica :"+actual);
               }
            }
         }
      }
    }
  }
}
