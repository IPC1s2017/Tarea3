

public class Ejercicio1 {
	public static void main(String[]args){
        
        
        int residuo=0;
        int entero=0;
        int prodinverso=0;
        int producto=0;
       
       for(int i=100;i<=999;i++){
            entero=i;
            int inverso=0;
            while(entero>0){
                residuo=entero%10;
                entero=entero/10;
                inverso=inverso*10+residuo;
                producto=i*i;
                prodinverso=inverso*inverso;
                //System.out.println(inverso+" "+prodinverso+" "+producto);
                int inv=0;
                int ent=prodinverso;
                int resi=0;
                while(ent>0){
                    resi=ent%10;
                    ent=ent/10;
                    inv=inv*10+resi;
                   // System.out.println(inv);
                }
                if(producto==inv){
                    System.out.println("El numero que se busca es "+ i);
                }
            }
             
        }
        
        
}
}