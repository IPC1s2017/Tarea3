public class Ejercicio5 {

    public static void main(String[] args) {

        int numero1=100;
        int numero2=999;
        int b=0, inverso=0,repeticiones=100, mayor=0, n1mayor=0,n2mayor=0;
        
        while(numero1<=numero2){
          int  a=numero1*numero2;
          int entero=numero1*numero2;
            while(a!=0){
                b=a%10;
                a=a/10;
                inverso=inverso*10+b;
              
            }
              if(entero==inverso){
             
               if(mayor<entero){
                  mayor=entero;
                  n1mayor=numero1;
                  n2mayor=numero2;
                }
                numero1++;
                b=0;
                inverso=0;
                repeticiones++;
              }
            else{
               
                
                numero1++;
                repeticiones++;
                b=0;
                inverso=0;
                
            }
            if(repeticiones==numero2){
                numero1=100;
                numero2--;
                repeticiones=100;
               
            }
        }
        System.out.println("Su numero palindormo mayor es "+n1mayor+"*"+n2mayor+"= "+mayor);
    }
    
}
