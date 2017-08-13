/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean fn = true;
        Boolean esSplit = false;
        while (fn) {          //Condición trivial: siempre cierta
            
            try{
               System.out.println("Escribe un numero");
               String numero = sc.nextLine();  //leer un String
               Integer noNumero = Integer.parseInt(numero);
               Integer cantDigitos = numero.length();
               
               if(cantDigitos>1){
                    Integer suma1Division = 0;
                    Integer suma2Division = 0;

                    //Es par
                    if(cantDigitos % 2 == 0){
                        for(int i=0; i<cantDigitos/2; i++){
                            suma1Division = suma1Division + Integer.parseInt(String.valueOf(numero.charAt(i)));
                        }

                        for(int i=cantDigitos/2; i<cantDigitos; i++){
                            suma2Division = suma2Division + Integer.parseInt(String.valueOf(numero.charAt(i)));
                        }
                    }else{
                        cantDigitos--;
                        Integer numeroIntermediario;
                        numeroIntermediario = Integer.parseInt(String.valueOf(numero.charAt((cantDigitos/2))));
                        
                        for(int i=0; i<cantDigitos/2; i++){
                            suma1Division = suma1Division + Integer.parseInt(String.valueOf(numero.charAt(i)));
                        }
                        
                        suma1Division = suma1Division + numeroIntermediario; 
                        
                        for(int i=((cantDigitos/2)+1); i<(cantDigitos+1); i++){
                            suma2Division = suma2Division + Integer.parseInt(String.valueOf(numero.charAt(i)));
                        }
                        suma2Division = suma2Division + numeroIntermediario;
                        
                        //Es impar

                    }
                    
                    if(suma1Division == suma2Division){
                        esSplit = true;
                     } 
                     
                    if(esSplit){
                        System.out.println("El numero es SPLIT");
                    }else{
                       System.out.println("El numero no es SPLIT");
                    }
               
                    fn = false;
                    
               }else{
                   System.out.println("Ingrese un numero con longitud mayor a 1"); 
               }
              
            }catch(Exception e){
                System.out.println("Ingrese un numero valido"); 
            }

        } 
        
        
    }
    
}
