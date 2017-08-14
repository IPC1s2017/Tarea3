import java.util.Scanner;

public class Numero_Perfecto {
	public static void main(String args[]){
Scanner entrada=new Scanner(System.in);
int a;
int suma=0;
System.out.println("Ingrese un numero");
a=entrada.nextInt();
if(a>0){
System.out.println("El numero es un entero");
for(int i=1;i<a;i++){
    
if(a%i==0){
suma=suma+i;
}
}
for(int b=1;b<2;b++){
 if(suma==a){
System.out.println("El numero es perfecto");
}
else{
System.out.println("No es un numero perfecto");
}
}
}
else{
System.out.println("No es un numero entero");    
}
   
}
}