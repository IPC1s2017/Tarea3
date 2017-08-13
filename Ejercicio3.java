
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese su numero");
        n= leer.nextInt();
        int r=0, e=n,n1=n,i=0;
        while(e!=0){
              
            if(e/10>=0){
                i++;
                e=e/10;
                 
            }
        }
        int p=0;
        int q= 0;
        int i2=i/2,contador=0;
        if(i%2==0){
            //cuando es un numero de digitos par
            if(contador<=i2){
                while(n1!=0){
                    r=n1%10;
                   
                    n1=n1/10;
                    if(contador<i2){
                     //p son los ultimos numeros   
                        p=p+r;
                        contador++;
                        
                    }else if(contador>=i2){
                    //q son los primeros
                        q=q+r;
                        contador++;
                    }
                    
                }
            }
        }
        else{
           if(contador<=i2){
                while(n1!=0){
                    r=n1%10;
                    System.out.println(r);
                    n1=n1/10;
                    if(contador<=i2){
                     //p son los ultimos numeros   
                        p=p+r;
                        
                        if(contador==i2){
                    //para tener el de enmedio
                            q=q+r;  
                            System.out.println("Lo que llevo en la "+q); 
                        }
                        contador++;
                    }
                    else if(contador>i2){
                    //q son los primeros
                        q=q+r;
                        contador++;
                    }
                }
            }
        }
        if(p==q){
            System.out.println("Su numero es esplit "+q+" , "+p);
        }else{
            System.out.println("su numero no es esplit "+q+" , "+p);
        }
    }
   
}
