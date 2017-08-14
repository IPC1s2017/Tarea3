//Juan Rigoberto Zu;ga Socop 
public class Ejercicio1{
	public static void main(String[] args){
		int num=100,num1=0;
		int inverso=0, inverso1=0;
		int dob=0;
		int dob2=0;
		int rec=0;
		for (int i=1;i<=800 ;i++ ) {
			inverso=0;
			inverso1=0;
			num1=num;
			dob=num*num;
			for (int j=0;j<=2 ;j++ ) {
				num1=(int)num1;
				rec=num1%10;
				num1=num1/10;
				if (num1>=0) {
					inverso=inverso*10+rec;
				}
			}
			//System.out.println("aca dob "+dob);
			dob2=inverso*inverso;
			rec=0;

			for (int h=0;h<=5 ;h++ ) {
				dob2=(int)dob2;
				rec=dob2%10;
				dob2=dob2/10;
				if (dob2>=0) {
					inverso1=inverso1*10+rec;
				}
			}
			//System.out.println("aca inverso "+inverso1);s
			if (inverso1==dob || dob==inverso1) {
				System.out.println("el numero "+num+" es caracteristico");
			}
			num=num+1;
		}
	}
}
/*Aux Luis Ramires no se lo que pasa pero programa no me a la ultima condicion,
la condicion que me dice si en numero es caracreristico*/