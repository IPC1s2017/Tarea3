
public class Ejercicio5 {
    public static void main(String[] args) {
    int residuo=0;
	int ent=999;
	int ent2=999;
	int c=0;
	int volt=0;
	int inverso=0;
	int rec=0;
	int p=0;
	int c1;
	while(ent!=100){
            c=ent*ent2;
            volt=c;
		if (ent<=999){
                    for(int i=0; i<=5; i++){
                        volt=(int) volt;
			rec=volt%10;
			volt=volt/10;
			if(volt>=0){
                            inverso=inverso*10+rec;
			}
		}
                    System.out.println(inverso +"   "+c);
		if (inverso==c){
                    p=inverso;
                    c1=c;
                    inverso=0;
                    ent2=ent2-1;
                    ent=100;
                }else{
                    ent2=ent2-1;
                    inverso=0;
                }
		}
            if(ent2<=100){
                ent=ent-1;
                ent2=999;
            }
	}
    } 
}
