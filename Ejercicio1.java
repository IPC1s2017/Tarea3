import java.util.Scanner;

public class Caracteristica_Numeros {
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int entero;
int residuo=0;
int inverso=0;
System.out.println("Ingrese un numero de 3 digitos caracteristico");
entero=reader.nextInt();
if(entero!=0)
residuo=(entero%10);
entero=entero/10;
inverso=((residuo*10+residuo)*10)+1;
System.out.println(inverso);
{

}
}    
}
