/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class Problema4 {

   public static void main(String[] args) {
        
        int contador = 0;
        int resultado = 0;
        int numero = 20;
        
        for(int i = 0 ; i < numero ; i++){
            
            contador = i;
            
            if(contador%3 == 0){
                resultado += i;
            }
            
            if(contador%5 == 0){
                resultado += i;
            }    
        }
        
        System.out.print("El resultado es:" + resultado);
    
    }
    
}
