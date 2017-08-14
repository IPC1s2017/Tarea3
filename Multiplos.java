public class Multiplos {
	public static void main(String args[]){
		int i;
		int multiplo=0;
		for(i=3;i<=999;i++){
			if(i%3==0||i%5==0){
				multiplo=multiplo+i;
				System.out.println(multiplo);
			}
		}
	}    
    
}