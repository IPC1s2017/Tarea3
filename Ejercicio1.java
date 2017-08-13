
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int Tope=999;
        int Inicio=100;
        int n3=0, rep=0,residuo=0;
        int Entero=0;
      
        while(Inicio<=Tope){
            int inverso=0;
            n3=Inicio*Inicio;
            Entero=Inicio;
            while(Entero!=0){
                residuo=Entero%10;
                Entero=Entero/10;
                inverso=inverso*10+residuo;
            }
            int n4=inverso*inverso;
            int Entero2=n4;
            int residuo2=0;
            int inverso2=0;
            while(Entero2!=0){
                residuo2=Entero2%10;
                Entero2=Entero2/10;
                inverso2=inverso2*10+residuo2;
            }
            
            if(n3==inverso2){
              System.out.println(Inicio+"*"+Inicio+"= "+n3);
              System.out.println(inverso+"*"+inverso+"= "+n4);
            }
                Inicio++;                 
        }          
           
        
    }
}
    
    

