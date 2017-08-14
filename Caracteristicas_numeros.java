package caracteristicas_numeros;


public class Caracteristicas_numeros {

    
    public static void main(String[] args) {
     int res=0;
    int ent=100;
    int inv=0;
    int inv1,inv2=1,x=1;
        
        for (int i = 100; i <=999; i++) {
            while (ent>0){
               x=i;
				res=(int) (ent*0.1);
				ent=ent/10;
				inv=(inv*10)+res;
			}
		inv1=inv*inv;
			while(inv1>0){
				res=(int) (inv1*0.1);
				inv2=inv1/10;
				inv2=(inv1*10)+res;
			}
			if (inv2==x*x){
				System.out.println(""+x);
			} 
            
            
        }
        
    }
    
}
