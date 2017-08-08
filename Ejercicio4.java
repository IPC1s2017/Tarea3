/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Jose David
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Suma=0;
        for(int i=3;i<=999;i++){
            
            if(i%3==0 || i%5==0){

                Suma=Suma+i;
            }
        
        }
        System.out.println("La suma de los multiplos es "+ Suma);
    }
    
}
